package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.util.Log;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.message.TokenParser;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;

class SVGParser {
    private static final String CURRENTCOLOR = "currentColor";
    public static final int ENTITY_WATCH_BUFFER_SIZE = 4096;
    private static final String FEATURE_STRING_PREFIX = "http://www.w3.org/TR/SVG11/feature#";
    private static final String NONE = "none";
    private static final String SVG_NAMESPACE = "http://www.w3.org/2000/svg";
    private static final String TAG = "SVGParser";
    private static final String VALID_DISPLAY_VALUES = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|";
    private static final String VALID_VISIBILITY_VALUES = "|visible|hidden|collapse|";
    private static final String XLINK_NAMESPACE = "http://www.w3.org/1999/xlink";
    public static final String XML_STYLESHEET_ATTR_ALTERNATE = "alternate";
    public static final String XML_STYLESHEET_ATTR_ALTERNATE_NO = "no";
    public static final String XML_STYLESHEET_ATTR_HREF = "href";
    public static final String XML_STYLESHEET_ATTR_MEDIA = "media";
    public static final String XML_STYLESHEET_ATTR_MEDIA_ALL = "all";
    public static final String XML_STYLESHEET_ATTR_TYPE = "type";
    private static final String XML_STYLESHEET_PROCESSING_INSTRUCTION = "xml-stylesheet";
    private SVG.SvgContainer currentElement = null;
    private int ignoreDepth;
    private boolean ignoring = false;
    private boolean inMetadataElement = false;
    private boolean inStyleElement = false;
    private StringBuilder metadataElementContents = null;
    private SVGElem metadataTag = null;
    private StringBuilder styleElementContents = null;
    private SVG svgDocument = null;

    /* renamed from: com.caverock.androidsvg.SVGParser$1 */
    static /* synthetic */ class C13331 {
        static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr = new int[SVGAttr.values().length];
        static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem = new int[SVGElem.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(240:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:205|206)|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|(3:269|270|272)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(241:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:205|206)|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|(3:269|270|272)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(242:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:205|206)|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|(3:269|270|272)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(243:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:205|206)|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|(3:269|270|272)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(245:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:205|206)|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|272) */
        /* JADX WARNING: Can't wrap try/catch for region: R(246:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:205|206)|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|272) */
        /* JADX WARNING: Can't wrap try/catch for region: R(247:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:205|206)|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|272) */
        /* JADX WARNING: Can't wrap try/catch for region: R(248:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:205|206)|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|272) */
        /* JADX WARNING: Can't wrap try/catch for region: R(249:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:205|206)|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|272) */
        /* JADX WARNING: Can't wrap try/catch for region: R(250:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:205|206)|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|272) */
        /* JADX WARNING: Can't wrap try/catch for region: R(251:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:205|206)|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|272) */
        /* JADX WARNING: Can't wrap try/catch for region: R(252:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:205|206)|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|272) */
        /* JADX WARNING: Can't wrap try/catch for region: R(253:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:205|206)|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|272) */
        /* JADX WARNING: Can't wrap try/catch for region: R(254:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|205|206|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|272) */
        /* JADX WARNING: Can't wrap try/catch for region: R(255:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|205|206|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|272) */
        /* JADX WARNING: Can't wrap try/catch for region: R(256:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|205|206|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|272) */
        /* JADX WARNING: Can't wrap try/catch for region: R(257:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|205|206|207|209|210|211|212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|272) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01b2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01be */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01ca */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x01d6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x01e2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x01ee */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x01fa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x0206 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x0212 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x021e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x022a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x0236 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x0242 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x024e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x025a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x0266 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x0272 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x027e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x028a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x0296 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x02a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x02ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x02ba */
        /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x02c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x02d2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x02de */
        /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x02ea */
        /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x02f6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x0302 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x030e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x031a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x0326 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x0332 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:167:0x033e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:169:0x034a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:171:0x0356 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x0362 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x036e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:177:0x037a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:179:0x0386 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:181:0x0392 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:183:0x039e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:185:0x03aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:187:0x03b6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:189:0x03c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:191:0x03ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:193:0x03da */
        /* JADX WARNING: Missing exception handler attribute for start block: B:195:0x03e6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:197:0x03f2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:199:0x03fe */
        /* JADX WARNING: Missing exception handler attribute for start block: B:201:0x040a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:203:0x0416 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:205:0x0422 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:211:0x0441 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:213:0x044b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:215:0x0455 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:217:0x045f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:219:0x0469 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:221:0x0473 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:223:0x047d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:225:0x0487 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:227:0x0491 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:229:0x049b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:231:0x04a5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:233:0x04af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:235:0x04b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:237:0x04c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:239:0x04cd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:241:0x04d9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:243:0x04e5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:245:0x04f1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:247:0x04fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:249:0x0509 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:251:0x0515 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:253:0x0521 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:255:0x052d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:257:0x0539 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:259:0x0545 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:261:0x0551 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:263:0x055d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:265:0x0569 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:267:0x0575 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:269:0x0581 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00b6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00da */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00e6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x00f2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x00fe */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x010a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0116 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0122 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x012e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x013a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0146 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0152 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x015e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x016a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0176 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0182 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x018e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x019a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x01a6 */
        static {
            /*
                com.caverock.androidsvg.SVGParser$SVGAttr[] r0 = com.caverock.androidsvg.SVGParser.SVGAttr.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr = r0
                r0 = 1
                int[] r1 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.caverock.androidsvg.SVGParser$SVGAttr r2 = com.caverock.androidsvg.SVGParser.SVGAttr.x     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x001f }
                com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.y     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x002a }
                com.caverock.androidsvg.SVGParser$SVGAttr r4 = com.caverock.androidsvg.SVGParser.SVGAttr.width     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.caverock.androidsvg.SVGParser$SVGAttr r5 = com.caverock.androidsvg.SVGParser.SVGAttr.height     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.caverock.androidsvg.SVGParser$SVGAttr r6 = com.caverock.androidsvg.SVGParser.SVGAttr.version     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                r5 = 6
                int[] r6 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x004b }
                com.caverock.androidsvg.SVGParser$SVGAttr r7 = com.caverock.androidsvg.SVGParser.SVGAttr.href     // Catch:{ NoSuchFieldError -> 0x004b }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                r6 = 7
                int[] r7 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.caverock.androidsvg.SVGParser$SVGAttr r8 = com.caverock.androidsvg.SVGParser.SVGAttr.preserveAspectRatio     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                r7 = 8
                int[] r8 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.caverock.androidsvg.SVGParser$SVGAttr r9 = com.caverock.androidsvg.SVGParser.SVGAttr.d     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                r8 = 9
                int[] r9 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x006e }
                com.caverock.androidsvg.SVGParser$SVGAttr r10 = com.caverock.androidsvg.SVGParser.SVGAttr.pathLength     // Catch:{ NoSuchFieldError -> 0x006e }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                r9 = 10
                int[] r10 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x007a }
                com.caverock.androidsvg.SVGParser$SVGAttr r11 = com.caverock.androidsvg.SVGParser.SVGAttr.rx     // Catch:{ NoSuchFieldError -> 0x007a }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r10[r11] = r9     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                r10 = 11
                int[] r11 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.caverock.androidsvg.SVGParser$SVGAttr r12 = com.caverock.androidsvg.SVGParser.SVGAttr.ry     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r11[r12] = r10     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                r11 = 12
                int[] r12 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.caverock.androidsvg.SVGParser$SVGAttr r13 = com.caverock.androidsvg.SVGParser.SVGAttr.cx     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r12[r13] = r11     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                r12 = 13
                int[] r13 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x009e }
                com.caverock.androidsvg.SVGParser$SVGAttr r14 = com.caverock.androidsvg.SVGParser.SVGAttr.cy     // Catch:{ NoSuchFieldError -> 0x009e }
                int r14 = r14.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r13[r14] = r12     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                r13 = 14
                int[] r14 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x00aa }
                com.caverock.androidsvg.SVGParser$SVGAttr r15 = com.caverock.androidsvg.SVGParser.SVGAttr.r     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r15 = r15.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r14[r15] = r13     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                r14 = 15
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x00b6 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.x1     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r15[r16] = r14     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x00c2 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.y1     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r17 = 16
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x00ce }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.x2     // Catch:{ NoSuchFieldError -> 0x00ce }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ce }
                r17 = 17
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x00ce }
            L_0x00ce:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x00da }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.y2     // Catch:{ NoSuchFieldError -> 0x00da }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00da }
                r17 = 18
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x00da }
            L_0x00da:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x00e6 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.dx     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r17 = 19
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x00f2 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.dy     // Catch:{ NoSuchFieldError -> 0x00f2 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f2 }
                r17 = 20
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x00f2 }
            L_0x00f2:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x00fe }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.requiredFeatures     // Catch:{ NoSuchFieldError -> 0x00fe }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fe }
                r17 = 21
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x00fe }
            L_0x00fe:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x010a }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.requiredExtensions     // Catch:{ NoSuchFieldError -> 0x010a }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x010a }
                r17 = 22
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x010a }
            L_0x010a:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0116 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.systemLanguage     // Catch:{ NoSuchFieldError -> 0x0116 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0116 }
                r17 = 23
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0116 }
            L_0x0116:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0122 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.requiredFormats     // Catch:{ NoSuchFieldError -> 0x0122 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                r17 = 24
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0122 }
            L_0x0122:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x012e }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.requiredFonts     // Catch:{ NoSuchFieldError -> 0x012e }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x012e }
                r17 = 25
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x012e }
            L_0x012e:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x013a }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.refX     // Catch:{ NoSuchFieldError -> 0x013a }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x013a }
                r17 = 26
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x013a }
            L_0x013a:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0146 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.refY     // Catch:{ NoSuchFieldError -> 0x0146 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0146 }
                r17 = 27
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0146 }
            L_0x0146:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0152 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.markerWidth     // Catch:{ NoSuchFieldError -> 0x0152 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0152 }
                r17 = 28
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0152 }
            L_0x0152:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x015e }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.markerHeight     // Catch:{ NoSuchFieldError -> 0x015e }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x015e }
                r17 = 29
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x015e }
            L_0x015e:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x016a }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.markerUnits     // Catch:{ NoSuchFieldError -> 0x016a }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x016a }
                r17 = 30
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x016a }
            L_0x016a:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0176 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.orient     // Catch:{ NoSuchFieldError -> 0x0176 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0176 }
                r17 = 31
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0176 }
            L_0x0176:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0182 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.gradientUnits     // Catch:{ NoSuchFieldError -> 0x0182 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0182 }
                r17 = 32
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0182 }
            L_0x0182:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x018e }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.gradientTransform     // Catch:{ NoSuchFieldError -> 0x018e }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x018e }
                r17 = 33
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x018e }
            L_0x018e:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x019a }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.spreadMethod     // Catch:{ NoSuchFieldError -> 0x019a }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x019a }
                r17 = 34
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x019a }
            L_0x019a:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x01a6 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.fx     // Catch:{ NoSuchFieldError -> 0x01a6 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a6 }
                r17 = 35
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x01a6 }
            L_0x01a6:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x01b2 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.fy     // Catch:{ NoSuchFieldError -> 0x01b2 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b2 }
                r17 = 36
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x01b2 }
            L_0x01b2:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x01be }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.offset     // Catch:{ NoSuchFieldError -> 0x01be }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x01be }
                r17 = 37
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x01be }
            L_0x01be:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x01ca }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.clipPathUnits     // Catch:{ NoSuchFieldError -> 0x01ca }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ca }
                r17 = 38
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x01ca }
            L_0x01ca:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x01d6 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.startOffset     // Catch:{ NoSuchFieldError -> 0x01d6 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d6 }
                r17 = 39
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x01d6 }
            L_0x01d6:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x01e2 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.patternUnits     // Catch:{ NoSuchFieldError -> 0x01e2 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e2 }
                r17 = 40
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x01e2 }
            L_0x01e2:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x01ee }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.patternContentUnits     // Catch:{ NoSuchFieldError -> 0x01ee }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ee }
                r17 = 41
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x01ee }
            L_0x01ee:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x01fa }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.patternTransform     // Catch:{ NoSuchFieldError -> 0x01fa }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x01fa }
                r17 = 42
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x01fa }
            L_0x01fa:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0206 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.maskUnits     // Catch:{ NoSuchFieldError -> 0x0206 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0206 }
                r17 = 43
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0206 }
            L_0x0206:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0212 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.maskContentUnits     // Catch:{ NoSuchFieldError -> 0x0212 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0212 }
                r17 = 44
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0212 }
            L_0x0212:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x021e }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.style     // Catch:{ NoSuchFieldError -> 0x021e }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x021e }
                r17 = 45
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x021e }
            L_0x021e:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x022a }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.CLASS     // Catch:{ NoSuchFieldError -> 0x022a }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x022a }
                r17 = 46
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x022a }
            L_0x022a:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0236 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.fill     // Catch:{ NoSuchFieldError -> 0x0236 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0236 }
                r17 = 47
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0236 }
            L_0x0236:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0242 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.fill_rule     // Catch:{ NoSuchFieldError -> 0x0242 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0242 }
                r17 = 48
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0242 }
            L_0x0242:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x024e }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.fill_opacity     // Catch:{ NoSuchFieldError -> 0x024e }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x024e }
                r17 = 49
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x024e }
            L_0x024e:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x025a }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke     // Catch:{ NoSuchFieldError -> 0x025a }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x025a }
                r17 = 50
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x025a }
            L_0x025a:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0266 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_opacity     // Catch:{ NoSuchFieldError -> 0x0266 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0266 }
                r17 = 51
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0266 }
            L_0x0266:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0272 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_width     // Catch:{ NoSuchFieldError -> 0x0272 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0272 }
                r17 = 52
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0272 }
            L_0x0272:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x027e }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_linecap     // Catch:{ NoSuchFieldError -> 0x027e }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x027e }
                r17 = 53
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x027e }
            L_0x027e:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x028a }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_linejoin     // Catch:{ NoSuchFieldError -> 0x028a }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x028a }
                r17 = 54
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x028a }
            L_0x028a:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0296 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_miterlimit     // Catch:{ NoSuchFieldError -> 0x0296 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0296 }
                r17 = 55
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0296 }
            L_0x0296:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x02a2 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_dasharray     // Catch:{ NoSuchFieldError -> 0x02a2 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x02a2 }
                r17 = 56
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x02a2 }
            L_0x02a2:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x02ae }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_dashoffset     // Catch:{ NoSuchFieldError -> 0x02ae }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ae }
                r17 = 57
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x02ae }
            L_0x02ae:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x02ba }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.opacity     // Catch:{ NoSuchFieldError -> 0x02ba }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ba }
                r17 = 58
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x02ba }
            L_0x02ba:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x02c6 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.color     // Catch:{ NoSuchFieldError -> 0x02c6 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x02c6 }
                r17 = 59
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x02c6 }
            L_0x02c6:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x02d2 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.font     // Catch:{ NoSuchFieldError -> 0x02d2 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x02d2 }
                r17 = 60
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x02d2 }
            L_0x02d2:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x02de }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.font_family     // Catch:{ NoSuchFieldError -> 0x02de }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x02de }
                r17 = 61
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x02de }
            L_0x02de:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x02ea }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.font_size     // Catch:{ NoSuchFieldError -> 0x02ea }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ea }
                r17 = 62
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x02ea }
            L_0x02ea:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x02f6 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.font_weight     // Catch:{ NoSuchFieldError -> 0x02f6 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x02f6 }
                r17 = 63
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x02f6 }
            L_0x02f6:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0302 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.font_style     // Catch:{ NoSuchFieldError -> 0x0302 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0302 }
                r17 = 64
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0302 }
            L_0x0302:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x030e }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.text_decoration     // Catch:{ NoSuchFieldError -> 0x030e }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x030e }
                r17 = 65
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x030e }
            L_0x030e:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x031a }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.direction     // Catch:{ NoSuchFieldError -> 0x031a }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x031a }
                r17 = 66
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x031a }
            L_0x031a:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0326 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.text_anchor     // Catch:{ NoSuchFieldError -> 0x0326 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0326 }
                r17 = 67
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0326 }
            L_0x0326:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0332 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.overflow     // Catch:{ NoSuchFieldError -> 0x0332 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0332 }
                r17 = 68
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0332 }
            L_0x0332:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x033e }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.marker     // Catch:{ NoSuchFieldError -> 0x033e }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x033e }
                r17 = 69
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x033e }
            L_0x033e:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x034a }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.marker_start     // Catch:{ NoSuchFieldError -> 0x034a }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x034a }
                r17 = 70
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x034a }
            L_0x034a:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0356 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.marker_mid     // Catch:{ NoSuchFieldError -> 0x0356 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0356 }
                r17 = 71
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0356 }
            L_0x0356:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0362 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.marker_end     // Catch:{ NoSuchFieldError -> 0x0362 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0362 }
                r17 = 72
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0362 }
            L_0x0362:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x036e }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.display     // Catch:{ NoSuchFieldError -> 0x036e }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x036e }
                r17 = 73
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x036e }
            L_0x036e:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x037a }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.visibility     // Catch:{ NoSuchFieldError -> 0x037a }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x037a }
                r17 = 74
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x037a }
            L_0x037a:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0386 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.stop_color     // Catch:{ NoSuchFieldError -> 0x0386 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0386 }
                r17 = 75
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0386 }
            L_0x0386:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0392 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.stop_opacity     // Catch:{ NoSuchFieldError -> 0x0392 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0392 }
                r17 = 76
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0392 }
            L_0x0392:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x039e }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.clip     // Catch:{ NoSuchFieldError -> 0x039e }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x039e }
                r17 = 77
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x039e }
            L_0x039e:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x03aa }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.clip_path     // Catch:{ NoSuchFieldError -> 0x03aa }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x03aa }
                r17 = 78
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x03aa }
            L_0x03aa:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x03b6 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.clip_rule     // Catch:{ NoSuchFieldError -> 0x03b6 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x03b6 }
                r17 = 79
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x03b6 }
            L_0x03b6:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x03c2 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.mask     // Catch:{ NoSuchFieldError -> 0x03c2 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x03c2 }
                r17 = 80
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x03c2 }
            L_0x03c2:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x03ce }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.solid_color     // Catch:{ NoSuchFieldError -> 0x03ce }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x03ce }
                r17 = 81
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x03ce }
            L_0x03ce:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x03da }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.solid_opacity     // Catch:{ NoSuchFieldError -> 0x03da }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x03da }
                r17 = 82
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x03da }
            L_0x03da:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x03e6 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.viewport_fill     // Catch:{ NoSuchFieldError -> 0x03e6 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x03e6 }
                r17 = 83
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x03e6 }
            L_0x03e6:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x03f2 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.viewport_fill_opacity     // Catch:{ NoSuchFieldError -> 0x03f2 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x03f2 }
                r17 = 84
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x03f2 }
            L_0x03f2:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x03fe }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.vector_effect     // Catch:{ NoSuchFieldError -> 0x03fe }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x03fe }
                r17 = 85
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x03fe }
            L_0x03fe:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x040a }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.image_rendering     // Catch:{ NoSuchFieldError -> 0x040a }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x040a }
                r17 = 86
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x040a }
            L_0x040a:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0416 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.viewBox     // Catch:{ NoSuchFieldError -> 0x0416 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0416 }
                r17 = 87
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0416 }
            L_0x0416:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x0422 }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.type     // Catch:{ NoSuchFieldError -> 0x0422 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0422 }
                r17 = 88
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x0422 }
            L_0x0422:
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr     // Catch:{ NoSuchFieldError -> 0x042e }
                com.caverock.androidsvg.SVGParser$SVGAttr r16 = com.caverock.androidsvg.SVGParser.SVGAttr.media     // Catch:{ NoSuchFieldError -> 0x042e }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x042e }
                r17 = 89
                r15[r16] = r17     // Catch:{ NoSuchFieldError -> 0x042e }
            L_0x042e:
                com.caverock.androidsvg.SVGParser$SVGElem[] r15 = com.caverock.androidsvg.SVGParser.SVGElem.values()
                int r15 = r15.length
                int[] r15 = new int[r15]
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem = r15
                int[] r15 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0441 }
                com.caverock.androidsvg.SVGParser$SVGElem r16 = com.caverock.androidsvg.SVGParser.SVGElem.svg     // Catch:{ NoSuchFieldError -> 0x0441 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0441 }
                r15[r16] = r0     // Catch:{ NoSuchFieldError -> 0x0441 }
            L_0x0441:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x044b }
                com.caverock.androidsvg.SVGParser$SVGElem r15 = com.caverock.androidsvg.SVGParser.SVGElem.g     // Catch:{ NoSuchFieldError -> 0x044b }
                int r15 = r15.ordinal()     // Catch:{ NoSuchFieldError -> 0x044b }
                r0[r15] = r1     // Catch:{ NoSuchFieldError -> 0x044b }
            L_0x044b:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0455 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.a     // Catch:{ NoSuchFieldError -> 0x0455 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0455 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0455 }
            L_0x0455:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x045f }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.defs     // Catch:{ NoSuchFieldError -> 0x045f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x045f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x045f }
            L_0x045f:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0469 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.use     // Catch:{ NoSuchFieldError -> 0x0469 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0469 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0469 }
            L_0x0469:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0473 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.path     // Catch:{ NoSuchFieldError -> 0x0473 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0473 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0473 }
            L_0x0473:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x047d }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.rect     // Catch:{ NoSuchFieldError -> 0x047d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x047d }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x047d }
            L_0x047d:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0487 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.circle     // Catch:{ NoSuchFieldError -> 0x0487 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0487 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0487 }
            L_0x0487:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0491 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.ellipse     // Catch:{ NoSuchFieldError -> 0x0491 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0491 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0491 }
            L_0x0491:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x049b }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.line     // Catch:{ NoSuchFieldError -> 0x049b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x049b }
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x049b }
            L_0x049b:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x04a5 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.polyline     // Catch:{ NoSuchFieldError -> 0x04a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x04a5 }
                r0[r1] = r10     // Catch:{ NoSuchFieldError -> 0x04a5 }
            L_0x04a5:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x04af }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.polygon     // Catch:{ NoSuchFieldError -> 0x04af }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x04af }
                r0[r1] = r11     // Catch:{ NoSuchFieldError -> 0x04af }
            L_0x04af:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x04b9 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.text     // Catch:{ NoSuchFieldError -> 0x04b9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x04b9 }
                r0[r1] = r12     // Catch:{ NoSuchFieldError -> 0x04b9 }
            L_0x04b9:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x04c3 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.tspan     // Catch:{ NoSuchFieldError -> 0x04c3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x04c3 }
                r0[r1] = r13     // Catch:{ NoSuchFieldError -> 0x04c3 }
            L_0x04c3:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x04cd }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.tref     // Catch:{ NoSuchFieldError -> 0x04cd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x04cd }
                r0[r1] = r14     // Catch:{ NoSuchFieldError -> 0x04cd }
            L_0x04cd:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x04d9 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.SWITCH     // Catch:{ NoSuchFieldError -> 0x04d9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x04d9 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x04d9 }
            L_0x04d9:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x04e5 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.symbol     // Catch:{ NoSuchFieldError -> 0x04e5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x04e5 }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x04e5 }
            L_0x04e5:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x04f1 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.marker     // Catch:{ NoSuchFieldError -> 0x04f1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x04f1 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x04f1 }
            L_0x04f1:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x04fd }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.linearGradient     // Catch:{ NoSuchFieldError -> 0x04fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x04fd }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x04fd }
            L_0x04fd:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0509 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.radialGradient     // Catch:{ NoSuchFieldError -> 0x0509 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0509 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0509 }
            L_0x0509:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0515 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.stop     // Catch:{ NoSuchFieldError -> 0x0515 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0515 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0515 }
            L_0x0515:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0521 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.title     // Catch:{ NoSuchFieldError -> 0x0521 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0521 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0521 }
            L_0x0521:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x052d }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.desc     // Catch:{ NoSuchFieldError -> 0x052d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x052d }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x052d }
            L_0x052d:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0539 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.clipPath     // Catch:{ NoSuchFieldError -> 0x0539 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0539 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0539 }
            L_0x0539:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0545 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.textPath     // Catch:{ NoSuchFieldError -> 0x0545 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0545 }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0545 }
            L_0x0545:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0551 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.pattern     // Catch:{ NoSuchFieldError -> 0x0551 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0551 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0551 }
            L_0x0551:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x055d }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.image     // Catch:{ NoSuchFieldError -> 0x055d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x055d }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x055d }
            L_0x055d:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0569 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.view     // Catch:{ NoSuchFieldError -> 0x0569 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0569 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0569 }
            L_0x0569:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0575 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.mask     // Catch:{ NoSuchFieldError -> 0x0575 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0575 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0575 }
            L_0x0575:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x0581 }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.style     // Catch:{ NoSuchFieldError -> 0x0581 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0581 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0581 }
            L_0x0581:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem     // Catch:{ NoSuchFieldError -> 0x058d }
                com.caverock.androidsvg.SVGParser$SVGElem r1 = com.caverock.androidsvg.SVGParser.SVGElem.solidColor     // Catch:{ NoSuchFieldError -> 0x058d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x058d }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x058d }
            L_0x058d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.C13331.<clinit>():void");
        }
    }

    private static class AspectRatioKeywords {
        private static final Map<String, PreserveAspectRatio.Alignment> aspectRatioKeywords = new HashMap(10);

        static {
            aspectRatioKeywords.put(SVGParser.NONE, PreserveAspectRatio.Alignment.none);
            aspectRatioKeywords.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            aspectRatioKeywords.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            aspectRatioKeywords.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            aspectRatioKeywords.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            aspectRatioKeywords.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            aspectRatioKeywords.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            aspectRatioKeywords.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            aspectRatioKeywords.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            aspectRatioKeywords.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }

        private AspectRatioKeywords() {
        }

        static PreserveAspectRatio.Alignment get(String str) {
            return aspectRatioKeywords.get(str);
        }
    }

    private static class ColourKeywords {
        private static final Map<String, Integer> colourKeywords = new HashMap(47);

        static {
            colourKeywords.put("aliceblue", -984833);
            colourKeywords.put("antiquewhite", -332841);
            colourKeywords.put("aqua", -16711681);
            colourKeywords.put("aquamarine", -8388652);
            colourKeywords.put("azure", -983041);
            colourKeywords.put("beige", -657956);
            colourKeywords.put("bisque", -6972);
            colourKeywords.put("black", -16777216);
            colourKeywords.put("blanchedalmond", -5171);
            colourKeywords.put("blue", -16776961);
            colourKeywords.put("blueviolet", -7722014);
            colourKeywords.put("brown", -5952982);
            colourKeywords.put("burlywood", -2180985);
            colourKeywords.put("cadetblue", -10510688);
            colourKeywords.put("chartreuse", -8388864);
            colourKeywords.put("chocolate", -2987746);
            colourKeywords.put("coral", -32944);
            colourKeywords.put("cornflowerblue", -10185235);
            colourKeywords.put("cornsilk", -1828);
            colourKeywords.put("crimson", -2354116);
            colourKeywords.put("cyan", -16711681);
            colourKeywords.put("darkblue", -16777077);
            colourKeywords.put("darkcyan", -16741493);
            colourKeywords.put("darkgoldenrod", -4684277);
            colourKeywords.put("darkgray", -5658199);
            colourKeywords.put("darkgreen", -16751616);
            colourKeywords.put("darkgrey", -5658199);
            colourKeywords.put("darkkhaki", -4343957);
            colourKeywords.put("darkmagenta", -7667573);
            colourKeywords.put("darkolivegreen", -11179217);
            colourKeywords.put("darkorange", -29696);
            colourKeywords.put("darkorchid", -6737204);
            colourKeywords.put("darkred", -7667712);
            colourKeywords.put("darksalmon", -1468806);
            colourKeywords.put("darkseagreen", -7357297);
            colourKeywords.put("darkslateblue", -12042869);
            colourKeywords.put("darkslategray", -13676721);
            colourKeywords.put("darkslategrey", -13676721);
            colourKeywords.put("darkturquoise", -16724271);
            colourKeywords.put("darkviolet", -7077677);
            colourKeywords.put("deeppink", -60269);
            colourKeywords.put("deepskyblue", -16728065);
            colourKeywords.put("dimgray", -9868951);
            colourKeywords.put("dimgrey", -9868951);
            colourKeywords.put("dodgerblue", -14774017);
            colourKeywords.put("firebrick", -5103070);
            colourKeywords.put("floralwhite", -1296);
            colourKeywords.put("forestgreen", -14513374);
            colourKeywords.put("fuchsia", -65281);
            colourKeywords.put("gainsboro", -2302756);
            colourKeywords.put("ghostwhite", -460545);
            colourKeywords.put("gold", -10496);
            colourKeywords.put("goldenrod", -2448096);
            colourKeywords.put("gray", -8355712);
            colourKeywords.put("green", -16744448);
            colourKeywords.put("greenyellow", -5374161);
            colourKeywords.put("grey", -8355712);
            colourKeywords.put("honeydew", -983056);
            colourKeywords.put("hotpink", -38476);
            colourKeywords.put("indianred", -3318692);
            colourKeywords.put("indigo", -11861886);
            colourKeywords.put("ivory", -16);
            colourKeywords.put("khaki", -989556);
            colourKeywords.put("lavender", -1644806);
            colourKeywords.put("lavenderblush", -3851);
            colourKeywords.put("lawngreen", -8586240);
            colourKeywords.put("lemonchiffon", -1331);
            colourKeywords.put("lightblue", -5383962);
            colourKeywords.put("lightcoral", -1015680);
            colourKeywords.put("lightcyan", -2031617);
            colourKeywords.put("lightgoldenrodyellow", -329006);
            colourKeywords.put("lightgray", -2894893);
            colourKeywords.put("lightgreen", -7278960);
            colourKeywords.put("lightgrey", -2894893);
            colourKeywords.put("lightpink", -18751);
            colourKeywords.put("lightsalmon", -24454);
            colourKeywords.put("lightseagreen", -14634326);
            colourKeywords.put("lightskyblue", -7876870);
            colourKeywords.put("lightslategray", -8943463);
            colourKeywords.put("lightslategrey", -8943463);
            colourKeywords.put("lightsteelblue", -5192482);
            colourKeywords.put("lightyellow", -32);
            colourKeywords.put("lime", -16711936);
            colourKeywords.put("limegreen", -13447886);
            colourKeywords.put("linen", -331546);
            colourKeywords.put("magenta", -65281);
            colourKeywords.put("maroon", -8388608);
            colourKeywords.put("mediumaquamarine", -10039894);
            colourKeywords.put("mediumblue", -16777011);
            colourKeywords.put("mediumorchid", -4565549);
            colourKeywords.put("mediumpurple", -7114533);
            colourKeywords.put("mediumseagreen", -12799119);
            colourKeywords.put("mediumslateblue", -8689426);
            colourKeywords.put("mediumspringgreen", -16713062);
            colourKeywords.put("mediumturquoise", -12004916);
            colourKeywords.put("mediumvioletred", -3730043);
            colourKeywords.put("midnightblue", -15132304);
            colourKeywords.put("mintcream", -655366);
            colourKeywords.put("mistyrose", -6943);
            colourKeywords.put("moccasin", -6987);
            colourKeywords.put("navajowhite", -8531);
            colourKeywords.put("navy", -16777088);
            colourKeywords.put("oldlace", -133658);
            colourKeywords.put("olive", -8355840);
            colourKeywords.put("olivedrab", -9728477);
            colourKeywords.put("orange", -23296);
            colourKeywords.put("orangered", -47872);
            colourKeywords.put("orchid", -2461482);
            colourKeywords.put("palegoldenrod", -1120086);
            colourKeywords.put("palegreen", -6751336);
            colourKeywords.put("paleturquoise", -5247250);
            colourKeywords.put("palevioletred", -2396013);
            colourKeywords.put("papayawhip", -4139);
            colourKeywords.put("peachpuff", -9543);
            colourKeywords.put("peru", -3308225);
            colourKeywords.put("pink", -16181);
            colourKeywords.put("plum", -2252579);
            colourKeywords.put("powderblue", -5185306);
            colourKeywords.put("purple", -8388480);
            colourKeywords.put("rebeccapurple", -10079335);
            colourKeywords.put("red", -65536);
            colourKeywords.put("rosybrown", -4419697);
            colourKeywords.put("royalblue", -12490271);
            colourKeywords.put("saddlebrown", -7650029);
            colourKeywords.put("salmon", -360334);
            colourKeywords.put("sandybrown", -744352);
            colourKeywords.put("seagreen", -13726889);
            colourKeywords.put("seashell", -2578);
            colourKeywords.put("sienna", -6270419);
            colourKeywords.put("silver", -4144960);
            colourKeywords.put("skyblue", -7876885);
            colourKeywords.put("slateblue", -9807155);
            colourKeywords.put("slategray", -9404272);
            colourKeywords.put("slategrey", -9404272);
            colourKeywords.put("snow", -1286);
            colourKeywords.put("springgreen", -16711809);
            colourKeywords.put("steelblue", -12156236);
            colourKeywords.put("tan", -2968436);
            colourKeywords.put("teal", -16744320);
            colourKeywords.put("thistle", -2572328);
            colourKeywords.put("tomato", -40121);
            colourKeywords.put("turquoise", -12525360);
            colourKeywords.put("violet", -1146130);
            colourKeywords.put("wheat", -663885);
            colourKeywords.put("white", -1);
            colourKeywords.put("whitesmoke", -657931);
            colourKeywords.put("yellow", -256);
            colourKeywords.put("yellowgreen", -6632142);
            colourKeywords.put("transparent", 0);
        }

        private ColourKeywords() {
        }

        static Integer get(String str) {
            return colourKeywords.get(str);
        }
    }

    private static class FontSizeKeywords {
        private static final Map<String, SVG.Length> fontSizeKeywords = new HashMap(9);

        static {
            fontSizeKeywords.put("xx-small", new SVG.Length(0.694f, SVG.Unit.pt));
            fontSizeKeywords.put("x-small", new SVG.Length(0.833f, SVG.Unit.pt));
            fontSizeKeywords.put("small", new SVG.Length(10.0f, SVG.Unit.pt));
            fontSizeKeywords.put("medium", new SVG.Length(12.0f, SVG.Unit.pt));
            fontSizeKeywords.put("large", new SVG.Length(14.4f, SVG.Unit.pt));
            fontSizeKeywords.put("x-large", new SVG.Length(17.3f, SVG.Unit.pt));
            fontSizeKeywords.put("xx-large", new SVG.Length(20.7f, SVG.Unit.pt));
            fontSizeKeywords.put("smaller", new SVG.Length(83.33f, SVG.Unit.percent));
            fontSizeKeywords.put("larger", new SVG.Length(120.0f, SVG.Unit.percent));
        }

        private FontSizeKeywords() {
        }

        static SVG.Length get(String str) {
            return fontSizeKeywords.get(str);
        }
    }

    private static class FontWeightKeywords {
        private static final Map<String, Integer> fontWeightKeywords = new HashMap(13);

        static {
            Map<String, Integer> map = fontWeightKeywords;
            Integer valueOf = Integer.valueOf(HttpStatus.SC_BAD_REQUEST);
            map.put("normal", valueOf);
            fontWeightKeywords.put("bold", 700);
            fontWeightKeywords.put("bolder", 1);
            fontWeightKeywords.put("lighter", -1);
            fontWeightKeywords.put("100", 100);
            fontWeightKeywords.put("200", Integer.valueOf(HttpStatus.SC_OK));
            fontWeightKeywords.put("300", Integer.valueOf(HttpStatus.SC_MULTIPLE_CHOICES));
            fontWeightKeywords.put("400", valueOf);
            fontWeightKeywords.put("500", Integer.valueOf(HttpStatus.SC_INTERNAL_SERVER_ERROR));
            fontWeightKeywords.put("600", 600);
            fontWeightKeywords.put("700", 700);
            fontWeightKeywords.put("800", 800);
            fontWeightKeywords.put("900", 900);
        }

        private FontWeightKeywords() {
        }

        static Integer get(String str) {
            return fontWeightKeywords.get(str);
        }
    }

    private class SAXHandler extends DefaultHandler2 {
        private SAXHandler() {
        }

        /* synthetic */ SAXHandler(SVGParser sVGParser, C13331 r2) {
            this();
        }

        public void characters(char[] cArr, int i, int i2) {
            SVGParser.this.text(new String(cArr, i, i2));
        }

        public void endDocument() {
            SVGParser.this.endDocument();
        }

        public void endElement(String str, String str2, String str3) {
            SVGParser.this.endElement(str, str2, str3);
        }

        public void processingInstruction(String str, String str2) {
            SVGParser.this.handleProcessingInstruction(str, SVGParser.this.parseProcessingInstructionAttributes(new TextScanner(str2)));
        }

        public void startDocument() {
            SVGParser.this.startDocument();
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) {
            SVGParser.this.startElement(str, str2, str3, attributes);
        }
    }

    private enum SVGAttr {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;
        
        private static final Map<String, SVGAttr> cache = null;

        static {
            int i;
            cache = new HashMap();
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    cache.put("class", sVGAttr);
                } else if (sVGAttr != UNSUPPORTED) {
                    cache.put(sVGAttr.name().replace('_', '-'), sVGAttr);
                }
            }
        }

        public static SVGAttr fromString(String str) {
            SVGAttr sVGAttr = cache.get(str);
            return sVGAttr != null ? sVGAttr : UNSUPPORTED;
        }
    }

    private enum SVGElem {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;
        
        private static final Map<String, SVGElem> cache = null;

        static {
            int i;
            cache = new HashMap();
            for (SVGElem sVGElem : values()) {
                if (sVGElem == SWITCH) {
                    cache.put("switch", sVGElem);
                } else if (sVGElem != UNSUPPORTED) {
                    cache.put(sVGElem.name(), sVGElem);
                }
            }
        }

        public static SVGElem fromString(String str) {
            SVGElem sVGElem = cache.get(str);
            return sVGElem != null ? sVGElem : UNSUPPORTED;
        }
    }

    static class TextScanner {
        String input;
        int inputLength = 0;
        private NumberParser numberParser = new NumberParser();
        int position = 0;

        TextScanner(String str) {
            this.input = str.trim();
            this.inputLength = this.input.length();
        }

        /* access modifiers changed from: package-private */
        public int advanceChar() {
            int i = this.position;
            int i2 = this.inputLength;
            if (i == i2) {
                return -1;
            }
            this.position = i + 1;
            int i3 = this.position;
            if (i3 < i2) {
                return this.input.charAt(i3);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public String ahead() {
            int i = this.position;
            while (!empty() && !isWhitespace(this.input.charAt(this.position))) {
                this.position++;
            }
            String substring = this.input.substring(i, this.position);
            this.position = i;
            return substring;
        }

        /* access modifiers changed from: package-private */
        public Boolean checkedNextFlag(Object obj) {
            if (obj == null) {
                return null;
            }
            skipCommaWhitespace();
            return nextFlag();
        }

        /* access modifiers changed from: package-private */
        public float checkedNextFloat(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            skipCommaWhitespace();
            return nextFloat();
        }

        /* access modifiers changed from: package-private */
        public float checkedNextFloat(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            skipCommaWhitespace();
            return nextFloat();
        }

        /* access modifiers changed from: package-private */
        public boolean consume(char c) {
            int i = this.position;
            boolean z = i < this.inputLength && this.input.charAt(i) == c;
            if (z) {
                this.position++;
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public boolean consume(String str) {
            int length = str.length();
            int i = this.position;
            boolean z = i <= this.inputLength - length && this.input.substring(i, i + length).equals(str);
            if (z) {
                this.position += length;
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public boolean empty() {
            return this.position == this.inputLength;
        }

        /* access modifiers changed from: package-private */
        public boolean hasLetter() {
            int i = this.position;
            if (i == this.inputLength) {
                return false;
            }
            char charAt = this.input.charAt(i);
            return (charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z');
        }

        /* access modifiers changed from: package-private */
        public boolean isEOL(int i) {
            return i == 10 || i == 13;
        }

        /* access modifiers changed from: package-private */
        public boolean isWhitespace(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        /* access modifiers changed from: package-private */
        public Integer nextChar() {
            int i = this.position;
            if (i == this.inputLength) {
                return null;
            }
            String str = this.input;
            this.position = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        /* access modifiers changed from: package-private */
        public Boolean nextFlag() {
            int i = this.position;
            if (i == this.inputLength) {
                return null;
            }
            char charAt = this.input.charAt(i);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            boolean z = true;
            this.position++;
            if (charAt != '1') {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* access modifiers changed from: package-private */
        public float nextFloat() {
            float parseNumber = this.numberParser.parseNumber(this.input, this.position, this.inputLength);
            if (!Float.isNaN(parseNumber)) {
                this.position = this.numberParser.getEndPos();
            }
            return parseNumber;
        }

        /* access modifiers changed from: package-private */
        public String nextFunction() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            int charAt = this.input.charAt(i);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    int i2 = this.position;
                } else {
                    charAt = advanceChar();
                }
            }
            int i22 = this.position;
            while (isWhitespace(charAt)) {
                charAt = advanceChar();
            }
            if (charAt == 40) {
                this.position++;
                return this.input.substring(i, i22);
            }
            this.position = i;
            return null;
        }

        /* access modifiers changed from: package-private */
        public SVG.Length nextLength() {
            float nextFloat = nextFloat();
            if (Float.isNaN(nextFloat)) {
                return null;
            }
            SVG.Unit nextUnit = nextUnit();
            return nextUnit == null ? new SVG.Length(nextFloat, SVG.Unit.px) : new SVG.Length(nextFloat, nextUnit);
        }

        /* access modifiers changed from: package-private */
        public String nextQuotedString() {
            int advanceChar;
            if (empty()) {
                return null;
            }
            int i = this.position;
            char charAt = this.input.charAt(i);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            do {
                advanceChar = advanceChar();
                if (advanceChar == -1) {
                    break;
                }
            } while (advanceChar != charAt);
            if (advanceChar == -1) {
                this.position = i;
                return null;
            }
            this.position++;
            return this.input.substring(i + 1, this.position - 1);
        }

        /* access modifiers changed from: package-private */
        public String nextToken() {
            return nextToken(TokenParser.f19315SP, false);
        }

        /* access modifiers changed from: package-private */
        public String nextToken(char c) {
            return nextToken(c, false);
        }

        /* access modifiers changed from: package-private */
        public String nextToken(char c, boolean z) {
            if (empty()) {
                return null;
            }
            char charAt = this.input.charAt(this.position);
            if ((!z && isWhitespace(charAt)) || charAt == c) {
                return null;
            }
            int i = this.position;
            while (true) {
                int advanceChar = advanceChar();
                if (advanceChar == -1 || advanceChar == c || (!z && isWhitespace(advanceChar))) {
                }
            }
            return this.input.substring(i, this.position);
        }

        /* access modifiers changed from: package-private */
        public String nextTokenWithWhitespace(char c) {
            return nextToken(c, true);
        }

        /* access modifiers changed from: package-private */
        public SVG.Unit nextUnit() {
            if (empty()) {
                return null;
            }
            if (this.input.charAt(this.position) == '%') {
                this.position++;
                return SVG.Unit.percent;
            }
            int i = this.position;
            if (i > this.inputLength - 2) {
                return null;
            }
            try {
                SVG.Unit valueOf = SVG.Unit.valueOf(this.input.substring(i, i + 2).toLowerCase(Locale.US));
                this.position += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public String nextWord() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            char charAt = this.input.charAt(i);
            if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                this.position = i;
                return null;
            }
            while (true) {
                int advanceChar = advanceChar();
                if ((advanceChar < 65 || advanceChar > 90) && (advanceChar < 97 || advanceChar > 122)) {
                }
            }
            return this.input.substring(i, this.position);
        }

        /* access modifiers changed from: package-private */
        public float possibleNextFloat() {
            skipCommaWhitespace();
            float parseNumber = this.numberParser.parseNumber(this.input, this.position, this.inputLength);
            if (!Float.isNaN(parseNumber)) {
                this.position = this.numberParser.getEndPos();
            }
            return parseNumber;
        }

        /* access modifiers changed from: package-private */
        public String restOfText() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            this.position = this.inputLength;
            return this.input.substring(i);
        }

        /* access modifiers changed from: package-private */
        public boolean skipCommaWhitespace() {
            skipWhitespace();
            int i = this.position;
            if (i == this.inputLength || this.input.charAt(i) != ',') {
                return false;
            }
            this.position++;
            skipWhitespace();
            return true;
        }

        /* access modifiers changed from: package-private */
        public void skipWhitespace() {
            while (true) {
                int i = this.position;
                if (i < this.inputLength && isWhitespace(this.input.charAt(i))) {
                    this.position++;
                } else {
                    return;
                }
            }
        }
    }

    private class XPPAttributesWrapper implements Attributes {
        private XmlPullParser parser;

        public XPPAttributesWrapper(XmlPullParser xmlPullParser) {
            this.parser = xmlPullParser;
        }

        public int getIndex(String str) {
            return -1;
        }

        public int getIndex(String str, String str2) {
            return -1;
        }

        public int getLength() {
            return this.parser.getAttributeCount();
        }

        public String getLocalName(int i) {
            return this.parser.getAttributeName(i);
        }

        public String getQName(int i) {
            String attributeName = this.parser.getAttributeName(i);
            if (this.parser.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.parser.getAttributePrefix(i) + ':' + attributeName;
        }

        public String getType(int i) {
            return null;
        }

        public String getType(String str) {
            return null;
        }

        public String getType(String str, String str2) {
            return null;
        }

        public String getURI(int i) {
            return this.parser.getAttributeNamespace(i);
        }

        public String getValue(int i) {
            return this.parser.getAttributeValue(i);
        }

        public String getValue(String str) {
            return null;
        }

        public String getValue(String str, String str2) {
            return null;
        }
    }

    SVGParser() {
    }

    private void appendToTextContainer(String str) {
        SVG.SvgConditionalContainer svgConditionalContainer = (SVG.SvgConditionalContainer) this.currentElement;
        int size = svgConditionalContainer.children.size();
        SVG.SvgObject svgObject = size == 0 ? null : svgConditionalContainer.children.get(size - 1);
        if (svgObject instanceof SVG.TextSequence) {
            StringBuilder sb = new StringBuilder();
            SVG.TextSequence textSequence = (SVG.TextSequence) svgObject;
            sb.append(textSequence.text);
            sb.append(str);
            textSequence.text = sb.toString();
            return;
        }
        this.currentElement.addChild(new SVG.TextSequence(str));
    }

    private void circle(Attributes attributes) {
        debug("<circle>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Circle circle = new SVG.Circle();
            circle.document = this.svgDocument;
            circle.parent = this.currentElement;
            parseAttributesCore(circle, attributes);
            parseAttributesStyle(circle, attributes);
            parseAttributesTransform(circle, attributes);
            parseAttributesConditional(circle, attributes);
            parseAttributesCircle(circle, attributes);
            this.currentElement.addChild(circle);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private static int clamp255(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    private void clipPath(Attributes attributes) {
        debug("<clipPath>", new Object[0]);
        if (this.currentElement != null) {
            SVG.ClipPath clipPath = new SVG.ClipPath();
            clipPath.document = this.svgDocument;
            clipPath.parent = this.currentElement;
            parseAttributesCore(clipPath, attributes);
            parseAttributesStyle(clipPath, attributes);
            parseAttributesTransform(clipPath, attributes);
            parseAttributesConditional(clipPath, attributes);
            parseAttributesClipPath(clipPath, attributes);
            this.currentElement.addChild(clipPath);
            this.currentElement = clipPath;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void debug(String str, Object... objArr) {
    }

    private void defs(Attributes attributes) {
        debug("<defs>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Defs defs = new SVG.Defs();
            defs.document = this.svgDocument;
            defs.parent = this.currentElement;
            parseAttributesCore(defs, attributes);
            parseAttributesStyle(defs, attributes);
            parseAttributesTransform(defs, attributes);
            this.currentElement.addChild(defs);
            this.currentElement = defs;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void dumpNode(SVG.SvgObject svgObject, String str) {
        Log.d(TAG, str + svgObject);
        if (svgObject instanceof SVG.SvgConditionalContainer) {
            String str2 = str + "  ";
            for (SVG.SvgObject dumpNode : ((SVG.SvgConditionalContainer) svgObject).children) {
                dumpNode(dumpNode, str2);
            }
        }
    }

    private void ellipse(Attributes attributes) {
        debug("<ellipse>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Ellipse ellipse = new SVG.Ellipse();
            ellipse.document = this.svgDocument;
            ellipse.parent = this.currentElement;
            parseAttributesCore(ellipse, attributes);
            parseAttributesStyle(ellipse, attributes);
            parseAttributesTransform(ellipse, attributes);
            parseAttributesConditional(ellipse, attributes);
            parseAttributesEllipse(ellipse, attributes);
            this.currentElement.addChild(ellipse);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* access modifiers changed from: private */
    public void endDocument() {
    }

    /* access modifiers changed from: private */
    public void endElement(String str, String str2, String str3) {
        if (this.ignoring) {
            int i = this.ignoreDepth - 1;
            this.ignoreDepth = i;
            if (i == 0) {
                this.ignoring = false;
                return;
            }
        }
        if (SVG_NAMESPACE.equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i2 = C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.fromString(str2).ordinal()];
            if (!(i2 == 1 || i2 == 2 || i2 == 4 || i2 == 5 || i2 == 13 || i2 == 14)) {
                switch (i2) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 31:
                        break;
                    case 22:
                    case 23:
                        this.inMetadataElement = false;
                        StringBuilder sb = this.metadataElementContents;
                        if (sb != null) {
                            SVGElem sVGElem = this.metadataTag;
                            if (sVGElem == SVGElem.title) {
                                this.svgDocument.setTitle(sb.toString());
                            } else if (sVGElem == SVGElem.desc) {
                                this.svgDocument.setDesc(sb.toString());
                            }
                            this.metadataElementContents.setLength(0);
                            return;
                        }
                        return;
                    case 30:
                        StringBuilder sb2 = this.styleElementContents;
                        if (sb2 != null) {
                            this.inStyleElement = false;
                            parseCSSStyleSheet(sb2.toString());
                            this.styleElementContents.setLength(0);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            this.currentElement = ((SVG.SvgObject) this.currentElement).parent;
        }
    }

    /* renamed from: g */
    private void m6453g(Attributes attributes) {
        debug("<g>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Group group = new SVG.Group();
            group.document = this.svgDocument;
            group.parent = this.currentElement;
            parseAttributesCore(group, attributes);
            parseAttributesStyle(group, attributes);
            parseAttributesTransform(group, attributes);
            parseAttributesConditional(group, attributes);
            this.currentElement.addChild(group);
            this.currentElement = group;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* access modifiers changed from: private */
    public void handleProcessingInstruction(String str, Map<String, String> map) {
        String str2;
        String resolveCSSStyleSheet;
        if (str.equals(XML_STYLESHEET_PROCESSING_INSTRUCTION) && SVG.getFileResolver() != null) {
            if (map.get(XML_STYLESHEET_ATTR_TYPE) != null && !"text/css".equals(map.get(XML_STYLESHEET_ATTR_TYPE))) {
                return;
            }
            if ((map.get(XML_STYLESHEET_ATTR_ALTERNATE) == null || XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(map.get(XML_STYLESHEET_ATTR_ALTERNATE))) && (str2 = map.get(XML_STYLESHEET_ATTR_HREF)) != null && (resolveCSSStyleSheet = SVG.getFileResolver().resolveCSSStyleSheet(str2)) != null) {
                String str3 = map.get(XML_STYLESHEET_ATTR_MEDIA);
                if (str3 != null && !XML_STYLESHEET_ATTR_MEDIA_ALL.equals(str3.trim())) {
                    resolveCSSStyleSheet = "@media " + str3 + " { " + resolveCSSStyleSheet + "}";
                }
                parseCSSStyleSheet(resolveCSSStyleSheet);
            }
        }
    }

    private static int hslToRgb(float f, float f2, float f3) {
        float f4 = (f >= 0.0f ? f % 360.0f : (f % 360.0f) + 360.0f) / 60.0f;
        float f5 = f2 / 100.0f;
        float f6 = f3 / 100.0f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        } else if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f7 = f6 <= 0.5f ? (f5 + 1.0f) * f6 : (f6 + f5) - (f5 * f6);
        float f8 = (f6 * 2.0f) - f7;
        return clamp255(hueToRgb(f8, f7, f4 - 2.0f) * 256.0f) | (clamp255(hueToRgb(f8, f7, f4 + 2.0f) * 256.0f) << 16) | (clamp255(hueToRgb(f8, f7, f4) * 256.0f) << 8);
    }

    private static float hueToRgb(float f, float f2, float f3) {
        float f4;
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            f4 = (f2 - f) * f3;
        } else if (f3 < 3.0f) {
            return f2;
        } else {
            if (f3 >= 4.0f) {
                return f;
            }
            f4 = (f2 - f) * (4.0f - f3);
        }
        return f4 + f;
    }

    private void image(Attributes attributes) {
        debug("<image>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Image image = new SVG.Image();
            image.document = this.svgDocument;
            image.parent = this.currentElement;
            parseAttributesCore(image, attributes);
            parseAttributesStyle(image, attributes);
            parseAttributesTransform(image, attributes);
            parseAttributesConditional(image, attributes);
            parseAttributesImage(image, attributes);
            this.currentElement.addChild(image);
            this.currentElement = image;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void line(Attributes attributes) {
        debug("<line>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Line line = new SVG.Line();
            line.document = this.svgDocument;
            line.parent = this.currentElement;
            parseAttributesCore(line, attributes);
            parseAttributesStyle(line, attributes);
            parseAttributesTransform(line, attributes);
            parseAttributesConditional(line, attributes);
            parseAttributesLine(line, attributes);
            this.currentElement.addChild(line);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void linearGradient(Attributes attributes) {
        debug("<linearGradient>", new Object[0]);
        if (this.currentElement != null) {
            SVG.SvgLinearGradient svgLinearGradient = new SVG.SvgLinearGradient();
            svgLinearGradient.document = this.svgDocument;
            svgLinearGradient.parent = this.currentElement;
            parseAttributesCore(svgLinearGradient, attributes);
            parseAttributesStyle(svgLinearGradient, attributes);
            parseAttributesGradient(svgLinearGradient, attributes);
            parseAttributesLinearGradient(svgLinearGradient, attributes);
            this.currentElement.addChild(svgLinearGradient);
            this.currentElement = svgLinearGradient;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void marker(Attributes attributes) {
        debug("<marker>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Marker marker = new SVG.Marker();
            marker.document = this.svgDocument;
            marker.parent = this.currentElement;
            parseAttributesCore(marker, attributes);
            parseAttributesStyle(marker, attributes);
            parseAttributesConditional(marker, attributes);
            parseAttributesViewBox(marker, attributes);
            parseAttributesMarker(marker, attributes);
            this.currentElement.addChild(marker);
            this.currentElement = marker;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void mask(Attributes attributes) {
        debug("<mask>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Mask mask = new SVG.Mask();
            mask.document = this.svgDocument;
            mask.parent = this.currentElement;
            parseAttributesCore(mask, attributes);
            parseAttributesStyle(mask, attributes);
            parseAttributesConditional(mask, attributes);
            parseAttributesMask(mask, attributes);
            this.currentElement.addChild(mask);
            this.currentElement = mask;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesCircle(SVG.Circle circle, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 12:
                    circle.f4653cx = parseLength(trim);
                    break;
                case 13:
                    circle.f4654cy = parseLength(trim);
                    break;
                case 14:
                    circle.f4655r = parseLength(trim);
                    if (!circle.f4655r.isNegative()) {
                        break;
                    } else {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
            }
        }
    }

    private void parseAttributesClipPath(SVG.ClipPath clipPath, Attributes attributes) {
        boolean z;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(trim)) {
                    z = false;
                } else if ("userSpaceOnUse".equals(trim)) {
                    z = true;
                } else {
                    throw new SVGParseException("Invalid value for attribute clipPathUnits");
                }
                clipPath.clipPathUnitsAreUser = z;
            }
        }
    }

    private void parseAttributesConditional(SVG.SvgConditional svgConditional, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 21:
                    svgConditional.setRequiredFeatures(parseRequiredFeatures(trim));
                    break;
                case 22:
                    svgConditional.setRequiredExtensions(trim);
                    break;
                case 23:
                    svgConditional.setSystemLanguage(parseSystemLanguage(trim));
                    break;
                case 24:
                    svgConditional.setRequiredFormats(parseRequiredFormats(trim));
                    break;
                case 25:
                    List<String> parseFontFamily = parseFontFamily(trim);
                    svgConditional.setRequiredFonts(parseFontFamily != null ? new HashSet(parseFontFamily) : new HashSet(0));
                    break;
            }
        }
    }

    private void parseAttributesCore(SVG.SvgElementBase svgElementBase, Attributes attributes) {
        Boolean bool;
        int i = 0;
        while (i < attributes.getLength()) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                svgElementBase.f4677id = attributes.getValue(i).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if (CookieSpecs.DEFAULT.equals(trim)) {
                    bool = Boolean.FALSE;
                } else if ("preserve".equals(trim)) {
                    bool = Boolean.TRUE;
                } else {
                    throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + trim);
                }
                svgElementBase.spacePreserve = bool;
                return;
            } else {
                i++;
            }
        }
    }

    private void parseAttributesEllipse(SVG.Ellipse ellipse, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 10:
                    ellipse.f4658rx = parseLength(trim);
                    if (!ellipse.f4658rx.isNegative()) {
                        break;
                    } else {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                case 11:
                    ellipse.f4659ry = parseLength(trim);
                    if (!ellipse.f4659ry.isNegative()) {
                        break;
                    } else {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                case 12:
                    ellipse.f4656cx = parseLength(trim);
                    break;
                case 13:
                    ellipse.f4657cy = parseLength(trim);
                    break;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseAttributesGradient(com.caverock.androidsvg.SVG.GradientElement r6, org.xml.sax.Attributes r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r7.getLength()
            if (r1 >= r2) goto L_0x0094
            java.lang.String r2 = r7.getValue(r1)
            java.lang.String r2 = r2.trim()
            int[] r3 = com.caverock.androidsvg.SVGParser.C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr
            java.lang.String r4 = r7.getLocalName(r1)
            com.caverock.androidsvg.SVGParser$SVGAttr r4 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r4)
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 6
            if (r3 == r4) goto L_0x0076
            switch(r3) {
                case 32: goto L_0x0051;
                case 33: goto L_0x004a;
                case 34: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0090
        L_0x0027:
            com.caverock.androidsvg.SVG$GradientSpread r3 = com.caverock.androidsvg.SVG.GradientSpread.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x002e }
            r6.spreadMethod = r3     // Catch:{ IllegalArgumentException -> 0x002e }
            goto L_0x0090
        L_0x002e:
            com.caverock.androidsvg.SVGParseException r6 = new com.caverock.androidsvg.SVGParseException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = "\" is not a valid value."
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x004a:
            android.graphics.Matrix r2 = r5.parseTransformList(r2)
            r6.gradientTransform = r2
            goto L_0x0090
        L_0x0051:
            java.lang.String r3 = "objectBoundingBox"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0060
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x005d:
            r6.gradientUnitsAreUser = r2
            goto L_0x0090
        L_0x0060:
            java.lang.String r3 = "userSpaceOnUse"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x006e
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x005d
        L_0x006e:
            com.caverock.androidsvg.SVGParseException r6 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r7 = "Invalid value for attribute gradientUnits"
            r6.<init>(r7)
            throw r6
        L_0x0076:
            java.lang.String r3 = r7.getURI(r1)
            java.lang.String r4 = ""
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x008e
            java.lang.String r3 = r7.getURI(r1)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0090
        L_0x008e:
            r6.href = r2
        L_0x0090:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesGradient(com.caverock.androidsvg.SVG$GradientElement, org.xml.sax.Attributes):void");
    }

    private void parseAttributesImage(SVG.Image image, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                image.f4660x = parseLength(trim);
            } else if (i2 == 2) {
                image.f4661y = parseLength(trim);
            } else if (i2 == 3) {
                image.width = parseLength(trim);
                if (image.width.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                image.height = parseLength(trim);
                if (image.height.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                if (i2 == 7) {
                    parsePreserveAspectRatio(image, trim);
                }
            } else if ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                image.href = trim;
            }
        }
    }

    private void parseAttributesLine(SVG.Line line, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    line.f4662x1 = parseLength(trim);
                    break;
                case 16:
                    line.f4664y1 = parseLength(trim);
                    break;
                case 17:
                    line.f4663x2 = parseLength(trim);
                    break;
                case 18:
                    line.f4665y2 = parseLength(trim);
                    break;
            }
        }
    }

    private void parseAttributesLinearGradient(SVG.SvgLinearGradient svgLinearGradient, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    svgLinearGradient.f4678x1 = parseLength(trim);
                    break;
                case 16:
                    svgLinearGradient.f4680y1 = parseLength(trim);
                    break;
                case 17:
                    svgLinearGradient.f4679x2 = parseLength(trim);
                    break;
                case 18:
                    svgLinearGradient.f4681y2 = parseLength(trim);
                    break;
            }
        }
    }

    private void parseAttributesMarker(SVG.Marker marker, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 26:
                    marker.refX = parseLength(trim);
                    break;
                case 27:
                    marker.refY = parseLength(trim);
                    break;
                case 28:
                    marker.markerWidth = parseLength(trim);
                    if (!marker.markerWidth.isNegative()) {
                        break;
                    } else {
                        throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                case 29:
                    marker.markerHeight = parseLength(trim);
                    if (!marker.markerHeight.isNegative()) {
                        break;
                    } else {
                        throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                case 30:
                    if ("strokeWidth".equals(trim)) {
                        marker.markerUnitsAreUser = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        marker.markerUnitsAreUser = true;
                        break;
                    } else {
                        throw new SVGParseException("Invalid value for attribute markerUnits");
                    }
                case 31:
                    marker.orient = Float.valueOf("auto".equals(trim) ? Float.NaN : parseFloat(trim));
                    break;
            }
        }
    }

    private void parseAttributesMask(SVG.Mask mask, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                mask.f4666x = parseLength(trim);
            } else if (i2 == 2) {
                mask.f4667y = parseLength(trim);
            } else if (i2 == 3) {
                mask.width = parseLength(trim);
                if (mask.width.isNegative()) {
                    throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                mask.height = parseLength(trim);
                if (mask.height.isNegative()) {
                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else if (i2 != 43) {
                if (i2 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(trim)) {
                    mask.maskContentUnitsAreUser = false;
                } else if ("userSpaceOnUse".equals(trim)) {
                    mask.maskContentUnitsAreUser = true;
                } else {
                    throw new SVGParseException("Invalid value for attribute maskContentUnits");
                }
            } else if ("objectBoundingBox".equals(trim)) {
                mask.maskUnitsAreUser = false;
            } else if ("userSpaceOnUse".equals(trim)) {
                mask.maskUnitsAreUser = true;
            } else {
                throw new SVGParseException("Invalid value for attribute maskUnits");
            }
        }
    }

    private void parseAttributesPath(SVG.Path path, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 8) {
                path.f4668d = parsePath(trim);
            } else if (i2 != 9) {
                continue;
            } else {
                path.pathLength = Float.valueOf(parseFloat(trim));
                if (path.pathLength.floatValue() < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d7, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseAttributesPattern(com.caverock.androidsvg.SVG.Pattern r8, org.xml.sax.Attributes r9) {
        /*
            r7 = this;
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0005:
            int r2 = r9.getLength()
            if (r0 >= r2) goto L_0x00db
            java.lang.String r2 = r9.getValue(r0)
            java.lang.String r2 = r2.trim()
            int[] r3 = com.caverock.androidsvg.SVGParser.C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr
            java.lang.String r4 = r9.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r4 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r4)
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L_0x00d1
            r5 = 2
            if (r3 == r5) goto L_0x00ca
            r5 = 3
            if (r3 == r5) goto L_0x00b3
            r5 = 4
            if (r3 == r5) goto L_0x009c
            r5 = 6
            if (r3 == r5) goto L_0x0081
            java.lang.String r5 = "userSpaceOnUse"
            java.lang.String r6 = "objectBoundingBox"
            switch(r3) {
                case 40: goto L_0x0063;
                case 41: goto L_0x0043;
                case 42: goto L_0x003b;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x00d7
        L_0x003b:
            android.graphics.Matrix r2 = r7.parseTransformList(r2)
            r8.patternTransform = r2
            goto L_0x00d7
        L_0x0043:
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L_0x004d
            r8.patternContentUnitsAreUser = r1
            goto L_0x00d7
        L_0x004d:
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x005b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r8.patternContentUnitsAreUser = r2
            goto L_0x00d7
        L_0x005b:
            com.caverock.androidsvg.SVGParseException r8 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r9 = "Invalid value for attribute patternContentUnits"
            r8.<init>(r9)
            throw r8
        L_0x0063:
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L_0x006c
            r8.patternUnitsAreUser = r1
            goto L_0x00d7
        L_0x006c:
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0079
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r8.patternUnitsAreUser = r2
            goto L_0x00d7
        L_0x0079:
            com.caverock.androidsvg.SVGParseException r8 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r9 = "Invalid value for attribute patternUnits"
            r8.<init>(r9)
            throw r8
        L_0x0081:
            java.lang.String r3 = r9.getURI(r0)
            java.lang.String r4 = ""
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0099
            java.lang.String r3 = r9.getURI(r0)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00d7
        L_0x0099:
            r8.href = r2
            goto L_0x00d7
        L_0x009c:
            com.caverock.androidsvg.SVG$Length r2 = parseLength(r2)
            r8.height = r2
            com.caverock.androidsvg.SVG$Length r2 = r8.height
            boolean r2 = r2.isNegative()
            if (r2 != 0) goto L_0x00ab
            goto L_0x00d7
        L_0x00ab:
            com.caverock.androidsvg.SVGParseException r8 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r9 = "Invalid <pattern> element. height cannot be negative"
            r8.<init>(r9)
            throw r8
        L_0x00b3:
            com.caverock.androidsvg.SVG$Length r2 = parseLength(r2)
            r8.width = r2
            com.caverock.androidsvg.SVG$Length r2 = r8.width
            boolean r2 = r2.isNegative()
            if (r2 != 0) goto L_0x00c2
            goto L_0x00d7
        L_0x00c2:
            com.caverock.androidsvg.SVGParseException r8 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r9 = "Invalid <pattern> element. width cannot be negative"
            r8.<init>(r9)
            throw r8
        L_0x00ca:
            com.caverock.androidsvg.SVG$Length r2 = parseLength(r2)
            r8.f4670y = r2
            goto L_0x00d7
        L_0x00d1:
            com.caverock.androidsvg.SVG$Length r2 = parseLength(r2)
            r8.f4669x = r2
        L_0x00d7:
            int r0 = r0 + 1
            goto L_0x0005
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesPattern(com.caverock.androidsvg.SVG$Pattern, org.xml.sax.Attributes):void");
    }

    private void parseAttributesPolyLine(SVG.PolyLine polyLine, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.points) {
                TextScanner textScanner = new TextScanner(attributes.getValue(i));
                ArrayList<Float> arrayList = new ArrayList<>();
                textScanner.skipWhitespace();
                while (!textScanner.empty()) {
                    float nextFloat = textScanner.nextFloat();
                    if (!Float.isNaN(nextFloat)) {
                        textScanner.skipCommaWhitespace();
                        float nextFloat2 = textScanner.nextFloat();
                        if (!Float.isNaN(nextFloat2)) {
                            textScanner.skipCommaWhitespace();
                            arrayList.add(Float.valueOf(nextFloat));
                            arrayList.add(Float.valueOf(nextFloat2));
                        } else {
                            throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                        }
                    } else {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                }
                polyLine.points = new float[arrayList.size()];
                int i2 = 0;
                for (Float floatValue : arrayList) {
                    polyLine.points[i2] = floatValue.floatValue();
                    i2++;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseAttributesRadialGradient(com.caverock.androidsvg.SVG.SvgRadialGradient r5, org.xml.sax.Attributes r6) {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L_0x0060
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.caverock.androidsvg.SVGParser.C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr
            java.lang.String r3 = r6.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 35
            if (r2 == r3) goto L_0x0057
            r3 = 36
            if (r2 == r3) goto L_0x0050
            switch(r2) {
                case 12: goto L_0x0049;
                case 13: goto L_0x0042;
                case 14: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x005d
        L_0x002b:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r5.f4686r = r1
            com.caverock.androidsvg.SVG$Length r1 = r5.f4686r
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x003a
            goto L_0x005d
        L_0x003a:
            com.caverock.androidsvg.SVGParseException r5 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r6 = "Invalid <radialGradient> element. r cannot be negative"
            r5.<init>(r6)
            throw r5
        L_0x0042:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r5.f4683cy = r1
            goto L_0x005d
        L_0x0049:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r5.f4682cx = r1
            goto L_0x005d
        L_0x0050:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r5.f4685fy = r1
            goto L_0x005d
        L_0x0057:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r5.f4684fx = r1
        L_0x005d:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesRadialGradient(com.caverock.androidsvg.SVG$SvgRadialGradient, org.xml.sax.Attributes):void");
    }

    private void parseAttributesRect(SVG.Rect rect, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                rect.f4673x = parseLength(trim);
            } else if (i2 == 2) {
                rect.f4674y = parseLength(trim);
            } else if (i2 == 3) {
                rect.width = parseLength(trim);
                if (rect.width.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                rect.height = parseLength(trim);
                if (rect.height.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (i2 == 10) {
                rect.f4671rx = parseLength(trim);
                if (rect.f4671rx.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i2 != 11) {
                continue;
            } else {
                rect.f4672ry = parseLength(trim);
                if (rect.f4672ry.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private void parseAttributesSVG(SVG.Svg svg, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                svg.f4675x = parseLength(trim);
            } else if (i2 == 2) {
                svg.f4676y = parseLength(trim);
            } else if (i2 == 3) {
                svg.width = parseLength(trim);
                if (svg.width.isNegative()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                svg.height = parseLength(trim);
                if (svg.height.isNegative()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (i2 == 5) {
                svg.version = trim;
            }
        }
    }

    private void parseAttributesStop(SVG.Stop stop, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 37) {
                stop.offset = parseGradientOffset(trim);
            }
        }
    }

    private void parseAttributesStyle(SVG.SvgElementBase svgElementBase, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int i2 = C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (i2 == 45) {
                    parseStyle(svgElementBase, trim);
                } else if (i2 != 46) {
                    if (svgElementBase.baseStyle == null) {
                        svgElementBase.baseStyle = new SVG.Style();
                    }
                    processStyleProperty(svgElementBase.baseStyle, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    svgElementBase.classNames = CSSParser.parseClassAttribute(trim);
                }
            }
        }
    }

    private void parseAttributesTRef(SVG.TRef tRef, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 6 && ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i)))) {
                tRef.href = trim;
            }
        }
    }

    private void parseAttributesTextPath(SVG.TextPath textPath, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 != 6) {
                if (i2 == 39) {
                    textPath.startOffset = parseLength(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                textPath.href = trim;
            }
        }
    }

    private void parseAttributesTextPosition(SVG.TextPositionedContainer textPositionedContainer, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                textPositionedContainer.f4689x = parseLengthList(trim);
            } else if (i2 == 2) {
                textPositionedContainer.f4690y = parseLengthList(trim);
            } else if (i2 == 19) {
                textPositionedContainer.f4687dx = parseLengthList(trim);
            } else if (i2 == 20) {
                textPositionedContainer.f4688dy = parseLengthList(trim);
            }
        }
    }

    private void parseAttributesTransform(SVG.HasTransform hasTransform, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.transform) {
                hasTransform.setTransform(parseTransformList(attributes.getValue(i)));
            }
        }
    }

    private void parseAttributesUse(SVG.Use use, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                use.f4699x = parseLength(trim);
            } else if (i2 == 2) {
                use.f4700y = parseLength(trim);
            } else if (i2 == 3) {
                use.width = parseLength(trim);
                if (use.width.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                use.height = parseLength(trim);
                if (use.height.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 == 6 && ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i)))) {
                use.href = trim;
            }
        }
    }

    private void parseAttributesViewBox(SVG.SvgViewBoxContainer svgViewBoxContainer, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                parsePreserveAspectRatio(svgViewBoxContainer, trim);
            } else if (i2 == 87) {
                svgViewBoxContainer.viewBox = parseViewBox(trim);
            }
        }
    }

    private void parseCSSStyleSheet(String str) {
        this.svgDocument.addCSSRules(new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document).parse(str));
    }

    private static SVG.CSSClipRect parseClip(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        TextScanner textScanner = new TextScanner(str.substring(5));
        textScanner.skipWhitespace();
        SVG.Length parseLengthOrAuto = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVG.Length parseLengthOrAuto2 = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVG.Length parseLengthOrAuto3 = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVG.Length parseLengthOrAuto4 = parseLengthOrAuto(textScanner);
        textScanner.skipWhitespace();
        if (textScanner.consume(')') || textScanner.empty()) {
            return new SVG.CSSClipRect(parseLengthOrAuto, parseLengthOrAuto2, parseLengthOrAuto3, parseLengthOrAuto4);
        }
        return null;
    }

    private static SVG.Colour parseColour(String str) {
        int i = 5;
        if (str.charAt(0) == '#') {
            IntegerParser parseHex = IntegerParser.parseHex(str, 1, str.length());
            if (parseHex != null) {
                int endPos = parseHex.getEndPos();
                if (endPos == 4) {
                    int value = parseHex.value();
                    int i2 = value & 3840;
                    int i3 = value & 240;
                    int i4 = value & 15;
                    return new SVG.Colour(i4 | (i2 << 8) | -16777216 | (i2 << 12) | (i3 << 8) | (i3 << 4) | (i4 << 4));
                } else if (endPos == 5) {
                    int value2 = parseHex.value();
                    int i5 = 61440 & value2;
                    int i6 = value2 & 3840;
                    int i7 = value2 & 240;
                    int i8 = value2 & 15;
                    return new SVG.Colour((i8 << 24) | (i8 << 28) | (i5 << 8) | (i5 << 4) | (i6 << 4) | i6 | i7 | (i7 >> 4));
                } else if (endPos == 7) {
                    return new SVG.Colour(parseHex.value() | -16777216);
                } else {
                    if (endPos == 9) {
                        return new SVG.Colour((parseHex.value() >>> 8) | (parseHex.value() << 24));
                    }
                    throw new SVGParseException("Bad hex colour value: " + str);
                }
            } else {
                throw new SVGParseException("Bad hex colour value: " + str);
            }
        } else {
            String lowerCase = str.toLowerCase(Locale.US);
            boolean startsWith = lowerCase.startsWith("rgba(");
            if (startsWith || lowerCase.startsWith("rgb(")) {
                if (!startsWith) {
                    i = 4;
                }
                TextScanner textScanner = new TextScanner(str.substring(i));
                textScanner.skipWhitespace();
                float nextFloat = textScanner.nextFloat();
                if (!Float.isNaN(nextFloat) && textScanner.consume('%')) {
                    nextFloat = (nextFloat * 256.0f) / 100.0f;
                }
                float checkedNextFloat = textScanner.checkedNextFloat(nextFloat);
                if (!Float.isNaN(checkedNextFloat) && textScanner.consume('%')) {
                    checkedNextFloat = (checkedNextFloat * 256.0f) / 100.0f;
                }
                float checkedNextFloat2 = textScanner.checkedNextFloat(checkedNextFloat);
                if (!Float.isNaN(checkedNextFloat2) && textScanner.consume('%')) {
                    checkedNextFloat2 = (checkedNextFloat2 * 256.0f) / 100.0f;
                }
                if (startsWith) {
                    float checkedNextFloat3 = textScanner.checkedNextFloat(checkedNextFloat2);
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(checkedNextFloat3) && textScanner.consume(')')) {
                        return new SVG.Colour((clamp255(checkedNextFloat3 * 256.0f) << 24) | (clamp255(nextFloat) << 16) | (clamp255(checkedNextFloat) << 8) | clamp255(checkedNextFloat2));
                    }
                    throw new SVGParseException("Bad rgba() colour value: " + str);
                }
                textScanner.skipWhitespace();
                if (!Float.isNaN(checkedNextFloat2) && textScanner.consume(')')) {
                    return new SVG.Colour((clamp255(nextFloat) << 16) | -16777216 | (clamp255(checkedNextFloat) << 8) | clamp255(checkedNextFloat2));
                }
                throw new SVGParseException("Bad rgb() colour value: " + str);
            }
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
                return parseColourKeyword(lowerCase);
            }
            if (!startsWith2) {
                i = 4;
            }
            TextScanner textScanner2 = new TextScanner(str.substring(i));
            textScanner2.skipWhitespace();
            float nextFloat2 = textScanner2.nextFloat();
            float checkedNextFloat4 = textScanner2.checkedNextFloat(nextFloat2);
            if (!Float.isNaN(checkedNextFloat4)) {
                textScanner2.consume('%');
            }
            float checkedNextFloat5 = textScanner2.checkedNextFloat(checkedNextFloat4);
            if (!Float.isNaN(checkedNextFloat5)) {
                textScanner2.consume('%');
            }
            if (startsWith2) {
                float checkedNextFloat6 = textScanner2.checkedNextFloat(checkedNextFloat5);
                textScanner2.skipWhitespace();
                if (!Float.isNaN(checkedNextFloat6) && textScanner2.consume(')')) {
                    return new SVG.Colour((clamp255(checkedNextFloat6 * 256.0f) << 24) | hslToRgb(nextFloat2, checkedNextFloat4, checkedNextFloat5));
                }
                throw new SVGParseException("Bad hsla() colour value: " + str);
            }
            textScanner2.skipWhitespace();
            if (!Float.isNaN(checkedNextFloat5) && textScanner2.consume(')')) {
                return new SVG.Colour(hslToRgb(nextFloat2, checkedNextFloat4, checkedNextFloat5) | -16777216);
            }
            throw new SVGParseException("Bad hsl() colour value: " + str);
        }
    }

    private static SVG.Colour parseColourKeyword(String str) {
        Integer num = ColourKeywords.get(str);
        if (num != null) {
            return new SVG.Colour(num.intValue());
        }
        throw new SVGParseException("Invalid colour keyword: " + str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.SvgPaint parseColourSpecifer(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 3387192(0x33af38, float:4.746467E-39)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 1442907498(0x5601056a, float:3.5465063E13)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "currentColor"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0024
            r0 = r2
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0024
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = -1
        L_0x0025:
            if (r0 == 0) goto L_0x0035
            if (r0 == r2) goto L_0x0030
            com.caverock.androidsvg.SVG$Colour r3 = parseColour(r3)     // Catch:{ SVGParseException -> 0x002e }
            return r3
        L_0x002e:
            r3 = 0
            return r3
        L_0x0030:
            com.caverock.androidsvg.SVG$CurrentColor r3 = com.caverock.androidsvg.SVG.CurrentColor.getInstance()
            return r3
        L_0x0035:
            com.caverock.androidsvg.SVG$Colour r3 = com.caverock.androidsvg.SVG.Colour.TRANSPARENT
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseColourSpecifer(java.lang.String):com.caverock.androidsvg.SVG$SvgPaint");
    }

    private static SVG.Style.FillRule parseFillRule(String str) {
        if ("nonzero".equals(str)) {
            return SVG.Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return SVG.Style.FillRule.EvenOdd;
        }
        return null;
    }

    private static float parseFloat(String str) {
        int length = str.length();
        if (length != 0) {
            return parseFloat(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    private static float parseFloat(String str, int i, int i2) {
        float parseNumber = new NumberParser().parseNumber(str, i, i2);
        if (!Float.isNaN(parseNumber)) {
            return parseNumber;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    private static void parseFont(SVG.Style style, String str) {
        String nextToken;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            TextScanner textScanner = new TextScanner(str);
            Integer num = null;
            SVG.Style.FontStyle fontStyle = null;
            String str2 = null;
            while (true) {
                nextToken = textScanner.nextToken('/');
                textScanner.skipWhitespace();
                if (nextToken != null) {
                    if (num == null || fontStyle == null) {
                        if (!nextToken.equals("normal") && ((num != null || (num = FontWeightKeywords.get(nextToken)) == null) && (fontStyle != null || (fontStyle = parseFontStyle(nextToken)) == null))) {
                            if (str2 != null || !nextToken.equals("small-caps")) {
                                break;
                            }
                            str2 = nextToken;
                        }
                    } else {
                        break;
                    }
                } else {
                    return;
                }
            }
            SVG.Length parseFontSize = parseFontSize(nextToken);
            if (textScanner.consume('/')) {
                textScanner.skipWhitespace();
                String nextToken2 = textScanner.nextToken();
                if (nextToken2 != null) {
                    try {
                        parseLength(nextToken2);
                    } catch (SVGParseException unused) {
                        return;
                    }
                }
                textScanner.skipWhitespace();
            }
            style.fontFamily = parseFontFamily(textScanner.restOfText());
            style.fontSize = parseFontSize;
            style.fontWeight = Integer.valueOf(num == null ? HttpStatus.SC_BAD_REQUEST : num.intValue());
            if (fontStyle == null) {
                fontStyle = SVG.Style.FontStyle.Normal;
            }
            style.fontStyle = fontStyle;
            style.specifiedFlags |= 122880;
        }
    }

    private static List<String> parseFontFamily(String str) {
        TextScanner textScanner = new TextScanner(str);
        ArrayList arrayList = null;
        do {
            String nextQuotedString = textScanner.nextQuotedString();
            if (nextQuotedString == null) {
                nextQuotedString = textScanner.nextTokenWithWhitespace(',');
            }
            if (nextQuotedString == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(nextQuotedString);
            textScanner.skipCommaWhitespace();
        } while (!textScanner.empty());
        return arrayList;
    }

    private static SVG.Length parseFontSize(String str) {
        try {
            SVG.Length length = FontSizeKeywords.get(str);
            return length == null ? parseLength(str) : length;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.Style.FontStyle parseFontStyle(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1657669071(0xffffffff9d31fa31, float:-2.35551E-21)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = -1178781136(0xffffffffb9bd3a30, float:-3.6092242E-4)
            if (r0 == r1) goto L_0x0020
            r1 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "normal"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "italic"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "oblique"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r2
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.caverock.androidsvg.SVG$Style$FontStyle r4 = com.caverock.androidsvg.SVG.Style.FontStyle.Oblique
            return r4
        L_0x0040:
            com.caverock.androidsvg.SVG$Style$FontStyle r4 = com.caverock.androidsvg.SVG.Style.FontStyle.Normal
            return r4
        L_0x0043:
            com.caverock.androidsvg.SVG$Style$FontStyle r4 = com.caverock.androidsvg.SVG.Style.FontStyle.Italic
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseFontStyle(java.lang.String):com.caverock.androidsvg.SVG$Style$FontStyle");
    }

    private static Integer parseFontWeight(String str) {
        return FontWeightKeywords.get(str);
    }

    private static String parseFunctionalIRI(String str, String str2) {
        if (str.equals(NONE) || !str.startsWith("url(")) {
            return null;
        }
        return (str.endsWith(")") ? str.substring(4, str.length() - 1) : str.substring(4)).trim();
    }

    private Float parseGradientOffset(String str) {
        if (str.length() != 0) {
            int length = str.length();
            boolean z = true;
            if (str.charAt(str.length() - 1) == '%') {
                length--;
            } else {
                z = false;
            }
            try {
                float parseFloat = parseFloat(str, 0, length);
                if (z) {
                    parseFloat /= 100.0f;
                }
                if (parseFloat < 0.0f) {
                    parseFloat = 0.0f;
                } else if (parseFloat > 100.0f) {
                    parseFloat = 100.0f;
                }
                return Float.valueOf(parseFloat);
            } catch (NumberFormatException e) {
                throw new SVGParseException("Invalid offset value in <stop>: " + str, e);
            }
        } else {
            throw new SVGParseException("Invalid offset value in <stop> (empty string)");
        }
    }

    static SVG.Length parseLength(String str) {
        if (str.length() != 0) {
            int length = str.length();
            SVG.Unit unit = SVG.Unit.px;
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                unit = SVG.Unit.percent;
            } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
                length -= 2;
                try {
                    unit = SVG.Unit.valueOf(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new SVGParseException("Invalid length unit specifier: " + str);
                }
            }
            try {
                return new SVG.Length(parseFloat(str, 0, length), unit);
            } catch (NumberFormatException e) {
                throw new SVGParseException("Invalid length value: " + str, e);
            }
        } else {
            throw new SVGParseException("Invalid length value (empty string)");
        }
    }

    private static List<SVG.Length> parseLengthList(String str) {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            TextScanner textScanner = new TextScanner(str);
            textScanner.skipWhitespace();
            while (!textScanner.empty()) {
                float nextFloat = textScanner.nextFloat();
                if (!Float.isNaN(nextFloat)) {
                    SVG.Unit nextUnit = textScanner.nextUnit();
                    if (nextUnit == null) {
                        nextUnit = SVG.Unit.px;
                    }
                    arrayList.add(new SVG.Length(nextFloat, nextUnit));
                    textScanner.skipCommaWhitespace();
                } else {
                    throw new SVGParseException("Invalid length list value: " + textScanner.ahead());
                }
            }
            return arrayList;
        }
        throw new SVGParseException("Invalid length list (empty string)");
    }

    private static SVG.Length parseLengthOrAuto(TextScanner textScanner) {
        return textScanner.consume("auto") ? new SVG.Length(0.0f) : textScanner.nextLength();
    }

    private static Float parseOpacity(String str) {
        try {
            float parseFloat = parseFloat(str);
            if (parseFloat < 0.0f) {
                parseFloat = 0.0f;
            } else if (parseFloat > 1.0f) {
                parseFloat = 1.0f;
            }
            return Float.valueOf(parseFloat);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean parseOverflow(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1217487446: goto L_0x0029;
                case -907680051: goto L_0x001f;
                case 3005871: goto L_0x0015;
                case 466743410: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "visible"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "auto"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = r3
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "scroll"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = r1
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "hidden"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = r2
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            if (r4 == 0) goto L_0x0041
            if (r4 == r3) goto L_0x0041
            if (r4 == r2) goto L_0x003e
            if (r4 == r1) goto L_0x003e
            r4 = 0
            return r4
        L_0x003e:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x0041:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseOverflow(java.lang.String):java.lang.Boolean");
    }

    private static SVG.SvgPaint parsePaintSpecifier(String str) {
        if (!str.startsWith("url(")) {
            return parseColourSpecifer(str);
        }
        int indexOf = str.indexOf(")");
        SVG.SvgPaint svgPaint = null;
        if (indexOf == -1) {
            return new SVG.PaintReference(str.substring(4).trim(), (SVG.SvgPaint) null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            svgPaint = parseColourSpecifer(trim2);
        }
        return new SVG.PaintReference(trim, svgPaint);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0143, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0197, code lost:
        r1.cubicTo(r2, r3, r8, r11, r15, r16);
        r2 = r8;
        r4 = r11;
        r1 = r15;
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f6, code lost:
        r0.skipCommaWhitespace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01fd, code lost:
        if (r0.empty() == false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ff, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0204, code lost:
        if (r0.hasLetter() == false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0206, code lost:
        r12 = r0.nextChar().intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.PathDefinition parsePath(java.lang.String r20) {
        /*
            com.caverock.androidsvg.SVGParser$TextScanner r0 = new com.caverock.androidsvg.SVGParser$TextScanner
            r1 = r20
            r0.<init>(r1)
            com.caverock.androidsvg.SVG$PathDefinition r9 = new com.caverock.androidsvg.SVG$PathDefinition
            r9.<init>()
            boolean r1 = r0.empty()
            if (r1 == 0) goto L_0x0013
            return r9
        L_0x0013:
            java.lang.Integer r1 = r0.nextChar()
            int r1 = r1.intValue()
            r2 = 77
            r10 = 109(0x6d, float:1.53E-43)
            if (r1 == r2) goto L_0x0024
            if (r1 == r10) goto L_0x0024
            return r9
        L_0x0024:
            r12 = r1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r13 = 0
            r14 = 0
        L_0x002b:
            r0.skipWhitespace()
            r5 = 108(0x6c, float:1.51E-43)
            r6 = 1073741824(0x40000000, float:2.0)
            java.lang.String r7 = " path segment"
            java.lang.String r8 = "Bad path coords for "
            java.lang.String r15 = "SVGParser"
            switch(r12) {
                case 65: goto L_0x01a6;
                case 67: goto L_0x0162;
                case 72: goto L_0x0146;
                case 76: goto L_0x0126;
                case 77: goto L_0x00f8;
                case 81: goto L_0x00cc;
                case 83: goto L_0x0099;
                case 84: goto L_0x0072;
                case 86: goto L_0x0047;
                case 90: goto L_0x003c;
                case 97: goto L_0x01a6;
                case 99: goto L_0x0162;
                case 104: goto L_0x0146;
                case 108: goto L_0x0126;
                case 109: goto L_0x00f8;
                case 113: goto L_0x00cc;
                case 115: goto L_0x0099;
                case 116: goto L_0x0072;
                case 118: goto L_0x0047;
                case 122: goto L_0x003c;
                default: goto L_0x003b;
            }
        L_0x003b:
            return r9
        L_0x003c:
            r9.close()
            r1 = r13
            r2 = r1
            r3 = r14
            r4 = r3
        L_0x0043:
            r18 = 0
            goto L_0x01f6
        L_0x0047:
            float r4 = r0.nextFloat()
            boolean r5 = java.lang.Float.isNaN(r4)
            if (r5 == 0) goto L_0x0068
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0056:
            r0.append(r8)
            char r1 = (char) r12
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r15, r0)
            return r9
        L_0x0068:
            r5 = 118(0x76, float:1.65E-43)
            if (r12 != r5) goto L_0x006d
            float r4 = r4 + r3
        L_0x006d:
            r9.lineTo(r1, r4)
            goto L_0x0143
        L_0x0072:
            float r5 = r1 * r6
            float r5 = r5 - r2
            float r6 = r6 * r3
            float r6 = r6 - r4
            float r2 = r0.nextFloat()
            float r4 = r0.checkedNextFloat((float) r2)
            boolean r16 = java.lang.Float.isNaN(r4)
            if (r16 == 0) goto L_0x008b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x0056
        L_0x008b:
            r7 = 116(0x74, float:1.63E-43)
            if (r12 != r7) goto L_0x0091
            float r2 = r2 + r1
            float r4 = r4 + r3
        L_0x0091:
            r9.quadTo(r5, r6, r2, r4)
            r1 = r2
            r3 = r4
            r2 = r5
            r4 = r6
            goto L_0x0043
        L_0x0099:
            float r5 = r1 * r6
            float r2 = r5 - r2
            float r6 = r6 * r3
            float r4 = r6 - r4
            float r5 = r0.nextFloat()
            float r6 = r0.checkedNextFloat((float) r5)
            float r11 = r0.checkedNextFloat((float) r6)
            float r16 = r0.checkedNextFloat((float) r11)
            boolean r17 = java.lang.Float.isNaN(r16)
            if (r17 == 0) goto L_0x00bc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x0056
        L_0x00bc:
            r7 = 115(0x73, float:1.61E-43)
            if (r12 != r7) goto L_0x00c5
            float r11 = r11 + r1
            float r16 = r16 + r3
            float r5 = r5 + r1
            float r6 = r6 + r3
        L_0x00c5:
            r8 = r5
            r15 = r11
            r11 = r6
            r1 = r9
            r3 = r4
            goto L_0x0197
        L_0x00cc:
            float r2 = r0.nextFloat()
            float r4 = r0.checkedNextFloat((float) r2)
            float r5 = r0.checkedNextFloat((float) r4)
            float r6 = r0.checkedNextFloat((float) r5)
            boolean r11 = java.lang.Float.isNaN(r6)
            if (r11 == 0) goto L_0x00e9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x0056
        L_0x00e9:
            r7 = 113(0x71, float:1.58E-43)
            if (r12 != r7) goto L_0x00f1
            float r5 = r5 + r1
            float r6 = r6 + r3
            float r2 = r2 + r1
            float r4 = r4 + r3
        L_0x00f1:
            r9.quadTo(r2, r4, r5, r6)
            r1 = r5
            r3 = r6
            goto L_0x0043
        L_0x00f8:
            float r2 = r0.nextFloat()
            float r4 = r0.checkedNextFloat((float) r2)
            boolean r6 = java.lang.Float.isNaN(r4)
            if (r6 == 0) goto L_0x010d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x0056
        L_0x010d:
            if (r12 != r10) goto L_0x0117
            boolean r6 = r9.isEmpty()
            if (r6 != 0) goto L_0x0117
            float r2 = r2 + r1
            float r4 = r4 + r3
        L_0x0117:
            r9.moveTo(r2, r4)
            if (r12 != r10) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r5 = 76
        L_0x011f:
            r1 = r2
            r13 = r1
            r3 = r4
            r14 = r3
            r12 = r5
            goto L_0x0043
        L_0x0126:
            float r2 = r0.nextFloat()
            float r4 = r0.checkedNextFloat((float) r2)
            boolean r6 = java.lang.Float.isNaN(r4)
            if (r6 == 0) goto L_0x013b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x0056
        L_0x013b:
            if (r12 != r5) goto L_0x013f
            float r2 = r2 + r1
            float r4 = r4 + r3
        L_0x013f:
            r9.lineTo(r2, r4)
            r1 = r2
        L_0x0143:
            r3 = r4
            goto L_0x0043
        L_0x0146:
            float r2 = r0.nextFloat()
            boolean r5 = java.lang.Float.isNaN(r2)
            if (r5 == 0) goto L_0x0157
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x0056
        L_0x0157:
            r5 = 104(0x68, float:1.46E-43)
            if (r12 != r5) goto L_0x015c
            float r2 = r2 + r1
        L_0x015c:
            r9.lineTo(r2, r3)
            r1 = r2
            goto L_0x0043
        L_0x0162:
            float r2 = r0.nextFloat()
            float r4 = r0.checkedNextFloat((float) r2)
            float r5 = r0.checkedNextFloat((float) r4)
            float r6 = r0.checkedNextFloat((float) r5)
            float r11 = r0.checkedNextFloat((float) r6)
            float r16 = r0.checkedNextFloat((float) r11)
            boolean r17 = java.lang.Float.isNaN(r16)
            if (r17 == 0) goto L_0x0187
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x0056
        L_0x0187:
            r7 = 99
            if (r12 != r7) goto L_0x0192
            float r11 = r11 + r1
            float r16 = r16 + r3
            float r2 = r2 + r1
            float r4 = r4 + r3
            float r5 = r5 + r1
            float r6 = r6 + r3
        L_0x0192:
            r3 = r4
            r8 = r5
            r15 = r11
            r11 = r6
            r1 = r9
        L_0x0197:
            r4 = r8
            r5 = r11
            r6 = r15
            r7 = r16
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = r8
            r4 = r11
            r1 = r15
            r3 = r16
            goto L_0x0043
        L_0x01a6:
            float r2 = r0.nextFloat()
            float r4 = r0.checkedNextFloat((float) r2)
            float r5 = r0.checkedNextFloat((float) r4)
            java.lang.Float r6 = java.lang.Float.valueOf(r5)
            java.lang.Boolean r6 = r0.checkedNextFlag(r6)
            java.lang.Boolean r11 = r0.checkedNextFlag(r6)
            float r10 = r0.checkedNextFloat((java.lang.Boolean) r11)
            float r17 = r0.checkedNextFloat((float) r10)
            boolean r18 = java.lang.Float.isNaN(r17)
            if (r18 != 0) goto L_0x0212
            r18 = 0
            int r19 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r19 < 0) goto L_0x0212
            int r19 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r19 >= 0) goto L_0x01d7
            goto L_0x0212
        L_0x01d7:
            r7 = 97
            if (r12 != r7) goto L_0x01de
            float r10 = r10 + r1
            float r17 = r17 + r3
        L_0x01de:
            boolean r6 = r6.booleanValue()
            boolean r7 = r11.booleanValue()
            r1 = r9
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r8 = r17
            r1.arcTo(r2, r3, r4, r5, r6, r7, r8)
            r1 = r10
            r2 = r1
            r3 = r17
            r4 = r3
        L_0x01f6:
            r0.skipCommaWhitespace()
            boolean r5 = r0.empty()
            if (r5 == 0) goto L_0x0200
            return r9
        L_0x0200:
            boolean r5 = r0.hasLetter()
            if (r5 == 0) goto L_0x020e
            java.lang.Integer r5 = r0.nextChar()
            int r12 = r5.intValue()
        L_0x020e:
            r10 = 109(0x6d, float:1.53E-43)
            goto L_0x002b
        L_0x0212:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parsePath(java.lang.String):com.caverock.androidsvg.SVG$PathDefinition");
    }

    static PreserveAspectRatio parsePreserveAspectRatio(String str) {
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        String nextToken = textScanner.nextToken();
        if ("defer".equals(nextToken)) {
            textScanner.skipWhitespace();
            nextToken = textScanner.nextToken();
        }
        PreserveAspectRatio.Alignment alignment = AspectRatioKeywords.get(nextToken);
        PreserveAspectRatio.Scale scale = null;
        textScanner.skipWhitespace();
        if (!textScanner.empty()) {
            String nextToken2 = textScanner.nextToken();
            char c = 65535;
            int hashCode = nextToken2.hashCode();
            if (hashCode != 3347527) {
                if (hashCode == 109526418 && nextToken2.equals("slice")) {
                    c = 1;
                }
            } else if (nextToken2.equals("meet")) {
                c = 0;
            }
            if (c == 0) {
                scale = PreserveAspectRatio.Scale.meet;
            } else if (c == 1) {
                scale = PreserveAspectRatio.Scale.slice;
            } else {
                throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
            }
        }
        return new PreserveAspectRatio(alignment, scale);
    }

    private static void parsePreserveAspectRatio(SVG.SvgPreserveAspectRatioContainer svgPreserveAspectRatioContainer, String str) {
        svgPreserveAspectRatioContainer.preserveAspectRatio = parsePreserveAspectRatio(str);
    }

    /* access modifiers changed from: private */
    public Map<String, String> parseProcessingInstructionAttributes(TextScanner textScanner) {
        HashMap hashMap = new HashMap();
        textScanner.skipWhitespace();
        while (true) {
            String nextToken = textScanner.nextToken('=');
            if (nextToken == null) {
                return hashMap;
            }
            textScanner.consume('=');
            hashMap.put(nextToken, textScanner.nextQuotedString());
            textScanner.skipWhitespace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.Style.RenderQuality parseRenderQuality(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -933002398(0xffffffffc8638362, float:-232973.53)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r0 == r1) goto L_0x0020
            r1 = 362741610(0x159eff6a, float:6.4218664E-26)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "optimizeSpeed"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "auto"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "optimizeQuality"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r3
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.caverock.androidsvg.SVG$Style$RenderQuality r4 = com.caverock.androidsvg.SVG.Style.RenderQuality.optimizeSpeed
            return r4
        L_0x0040:
            com.caverock.androidsvg.SVG$Style$RenderQuality r4 = com.caverock.androidsvg.SVG.Style.RenderQuality.optimizeQuality
            return r4
        L_0x0043:
            com.caverock.androidsvg.SVG$Style$RenderQuality r4 = com.caverock.androidsvg.SVG.Style.RenderQuality.auto
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseRenderQuality(java.lang.String):com.caverock.androidsvg.SVG$Style$RenderQuality");
    }

    private static Set<String> parseRequiredFeatures(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            String nextToken = textScanner.nextToken();
            hashSet.add(nextToken.startsWith(FEATURE_STRING_PREFIX) ? nextToken.substring(35) : "UNSUPPORTED");
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static Set<String> parseRequiredFormats(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            hashSet.add(textScanner.nextToken());
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static SVG.Length[] parseStrokeDashArray(String str) {
        SVG.Length nextLength;
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        if (textScanner.empty() || (nextLength = textScanner.nextLength()) == null || nextLength.isNegative()) {
            return null;
        }
        float floatValue = nextLength.floatValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(nextLength);
        while (!textScanner.empty()) {
            textScanner.skipCommaWhitespace();
            SVG.Length nextLength2 = textScanner.nextLength();
            if (nextLength2 == null || nextLength2.isNegative()) {
                return null;
            }
            arrayList.add(nextLength2);
            floatValue += nextLength2.floatValue();
        }
        if (floatValue == 0.0f) {
            return null;
        }
        return (SVG.Length[]) arrayList.toArray(new SVG.Length[arrayList.size()]);
    }

    private static SVG.Style.LineCap parseStrokeLineCap(String str) {
        if ("butt".equals(str)) {
            return SVG.Style.LineCap.Butt;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineCap.Round;
        }
        if ("square".equals(str)) {
            return SVG.Style.LineCap.Square;
        }
        return null;
    }

    private static SVG.Style.LineJoin parseStrokeLineJoin(String str) {
        if ("miter".equals(str)) {
            return SVG.Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineJoin.Round;
        }
        if ("bevel".equals(str)) {
            return SVG.Style.LineJoin.Bevel;
        }
        return null;
    }

    private static void parseStyle(SVG.SvgElementBase svgElementBase, String str) {
        TextScanner textScanner = new TextScanner(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String nextToken = textScanner.nextToken(':');
            textScanner.skipWhitespace();
            if (textScanner.consume(':')) {
                textScanner.skipWhitespace();
                String nextTokenWithWhitespace = textScanner.nextTokenWithWhitespace(';');
                if (nextTokenWithWhitespace != null) {
                    textScanner.skipWhitespace();
                    if (textScanner.empty() || textScanner.consume(';')) {
                        if (svgElementBase.style == null) {
                            svgElementBase.style = new SVG.Style();
                        }
                        processStyleProperty(svgElementBase.style, nextToken, nextTokenWithWhitespace);
                        textScanner.skipWhitespace();
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private static Set<String> parseSystemLanguage(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            String nextToken = textScanner.nextToken();
            int indexOf = nextToken.indexOf(45);
            if (indexOf != -1) {
                nextToken = nextToken.substring(0, indexOf);
            }
            hashSet.add(new Locale(nextToken, "", "").getLanguage());
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.Style.TextAnchor parseTextAnchor(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1074341483(0xffffffffbff6d995, float:-1.9285151)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 100571(0x188db, float:1.4093E-40)
            if (r0 == r1) goto L_0x0020
            r1 = 109757538(0x68ac462, float:5.219839E-35)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "start"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "end"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "middle"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r3
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.caverock.androidsvg.SVG$Style$TextAnchor r4 = com.caverock.androidsvg.SVG.Style.TextAnchor.End
            return r4
        L_0x0040:
            com.caverock.androidsvg.SVG$Style$TextAnchor r4 = com.caverock.androidsvg.SVG.Style.TextAnchor.Middle
            return r4
        L_0x0043:
            com.caverock.androidsvg.SVG$Style$TextAnchor r4 = com.caverock.androidsvg.SVG.Style.TextAnchor.Start
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseTextAnchor(java.lang.String):com.caverock.androidsvg.SVG$Style$TextAnchor");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.Style.TextDecoration parseTextDecoration(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1171789332: goto L_0x0034;
                case -1026963764: goto L_0x002a;
                case 3387192: goto L_0x0020;
                case 93826908: goto L_0x0016;
                case 529818312: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "overline"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r3
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "blink"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r1
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "none"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 0
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "underline"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r4
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "line-through"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r2
            goto L_0x003f
        L_0x003e:
            r5 = -1
        L_0x003f:
            if (r5 == 0) goto L_0x0057
            if (r5 == r4) goto L_0x0054
            if (r5 == r3) goto L_0x0051
            if (r5 == r2) goto L_0x004e
            if (r5 == r1) goto L_0x004b
            r5 = 0
            return r5
        L_0x004b:
            com.caverock.androidsvg.SVG$Style$TextDecoration r5 = com.caverock.androidsvg.SVG.Style.TextDecoration.Blink
            return r5
        L_0x004e:
            com.caverock.androidsvg.SVG$Style$TextDecoration r5 = com.caverock.androidsvg.SVG.Style.TextDecoration.LineThrough
            return r5
        L_0x0051:
            com.caverock.androidsvg.SVG$Style$TextDecoration r5 = com.caverock.androidsvg.SVG.Style.TextDecoration.Overline
            return r5
        L_0x0054:
            com.caverock.androidsvg.SVG$Style$TextDecoration r5 = com.caverock.androidsvg.SVG.Style.TextDecoration.Underline
            return r5
        L_0x0057:
            com.caverock.androidsvg.SVG$Style$TextDecoration r5 = com.caverock.androidsvg.SVG.Style.TextDecoration.None
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseTextDecoration(java.lang.String):com.caverock.androidsvg.SVG$Style$TextDecoration");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.Style.TextDirection parseTextDirection(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 107498(0x1a3ea, float:1.50637E-40)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 113258(0x1ba6a, float:1.58708E-40)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "rtl"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0024
            r3 = r2
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "ltr"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0024
            r3 = 0
            goto L_0x0025
        L_0x0024:
            r3 = -1
        L_0x0025:
            if (r3 == 0) goto L_0x002e
            if (r3 == r2) goto L_0x002b
            r3 = 0
            return r3
        L_0x002b:
            com.caverock.androidsvg.SVG$Style$TextDirection r3 = com.caverock.androidsvg.SVG.Style.TextDirection.RTL
            return r3
        L_0x002e:
            com.caverock.androidsvg.SVG$Style$TextDirection r3 = com.caverock.androidsvg.SVG.Style.TextDirection.LTR
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseTextDirection(java.lang.String):com.caverock.androidsvg.SVG$Style$TextDirection");
    }

    private Matrix parseTransformList(String str) {
        String str2 = str;
        Matrix matrix = new Matrix();
        TextScanner textScanner = new TextScanner(str2);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            String nextFunction = textScanner.nextFunction();
            if (nextFunction != null) {
                char c = 65535;
                switch (nextFunction.hashCode()) {
                    case -1081239615:
                        if (nextFunction.equals("matrix")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -925180581:
                        if (nextFunction.equals("rotate")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 109250890:
                        if (nextFunction.equals("scale")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 109493390:
                        if (nextFunction.equals("skewX")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 109493391:
                        if (nextFunction.equals("skewY")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1052832078:
                        if (nextFunction.equals("translate")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    textScanner.skipWhitespace();
                    float nextFloat = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat2 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat3 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat4 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat5 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat6 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat6) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{nextFloat, nextFloat3, nextFloat5, nextFloat2, nextFloat4, nextFloat6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                } else if (c == 1) {
                    textScanner.skipWhitespace();
                    float nextFloat7 = textScanner.nextFloat();
                    float possibleNextFloat = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat7) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    } else if (Float.isNaN(possibleNextFloat)) {
                        matrix.preTranslate(nextFloat7, 0.0f);
                    } else {
                        matrix.preTranslate(nextFloat7, possibleNextFloat);
                    }
                } else if (c == 2) {
                    textScanner.skipWhitespace();
                    float nextFloat8 = textScanner.nextFloat();
                    float possibleNextFloat2 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat8) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    } else if (Float.isNaN(possibleNextFloat2)) {
                        matrix.preScale(nextFloat8, nextFloat8);
                    } else {
                        matrix.preScale(nextFloat8, possibleNextFloat2);
                    }
                } else if (c == 3) {
                    textScanner.skipWhitespace();
                    float nextFloat9 = textScanner.nextFloat();
                    float possibleNextFloat3 = textScanner.possibleNextFloat();
                    float possibleNextFloat4 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat9) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    } else if (Float.isNaN(possibleNextFloat3)) {
                        matrix.preRotate(nextFloat9);
                    } else if (!Float.isNaN(possibleNextFloat4)) {
                        matrix.preRotate(nextFloat9, possibleNextFloat3, possibleNextFloat4);
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    }
                } else if (c == 4) {
                    textScanner.skipWhitespace();
                    float nextFloat10 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat10) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians((double) nextFloat10)), 0.0f);
                } else if (c == 5) {
                    textScanner.skipWhitespace();
                    float nextFloat11 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat11) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) nextFloat11)));
                } else {
                    throw new SVGParseException("Invalid transform list fn: " + nextFunction + ")");
                }
                if (textScanner.empty()) {
                    return matrix;
                }
                textScanner.skipCommaWhitespace();
            } else {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str2);
            }
        }
        return matrix;
    }

    private void parseUsingSAX(InputStream inputStream) {
        Log.d(TAG, "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature(://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            SAXHandler sAXHandler = new SAXHandler(this, (C13331) null);
            xMLReader.setContentHandler(sAXHandler);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", sAXHandler);
            xMLReader.parse(new InputSource(inputStream));
        } catch (ParserConfigurationException e) {
            throw new SVGParseException("XML parser problem", e);
        } catch (SAXException e2) {
            throw new SVGParseException("SVG parse error", e2);
        } catch (IOException e3) {
            throw new SVGParseException("Stream error", e3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0116, code lost:
        throw new com.caverock.androidsvg.SVGParseException("Stream error", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0117, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011f, code lost:
        throw new com.caverock.androidsvg.SVGParseException("XML parser problem", r9);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0117 A[ExcHandler: XmlPullParserException (r9v1 'e' org.xmlpull.v1.XmlPullParserException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseUsingXmlPullParser(java.io.InputStream r9, boolean r10) {
        /*
            r8 = this;
            org.xmlpull.v1.XmlPullParser r0 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            com.caverock.androidsvg.SVGParser$XPPAttributesWrapper r1 = new com.caverock.androidsvg.SVGParser$XPPAttributesWrapper     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = "http://xmlpull.org/v1/doc/features.html#process-docdecl"
            r3 = 0
            r0.setFeature(r2, r3)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r4 = 1
            r0.setFeature(r2, r4)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2 = 0
            r0.setInput(r9, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x001d:
            if (r2 == r4) goto L_0x010a
            if (r2 == 0) goto L_0x0101
            r5 = 8
            java.lang.String r6 = "SVGParser"
            if (r2 == r5) goto L_0x00d4
            r5 = 10
            if (r2 == r5) goto L_0x00ac
            r5 = 58
            r6 = 2
            if (r2 == r6) goto L_0x0080
            r7 = 3
            if (r2 == r7) goto L_0x0053
            r5 = 4
            if (r2 == r5) goto L_0x0044
            r5 = 5
            if (r2 == r5) goto L_0x003b
            goto L_0x0104
        L_0x003b:
            java.lang.String r2 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.text((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0104
        L_0x0044:
            int[] r2 = new int[r6]     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            char[] r5 = r0.getTextCharacters(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6 = r2[r3]     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2 = r2[r4]     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.text(r5, r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0104
        L_0x0053:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r6 == 0) goto L_0x0073
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r7 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x0073:
            java.lang.String r5 = r0.getNamespace()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.endElement(r5, r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0104
        L_0x0080:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r6 == 0) goto L_0x00a0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r7 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x00a0:
            java.lang.String r5 = r0.getNamespace()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.startElement(r5, r6, r2, r1)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0104
        L_0x00ac:
            if (r10 == 0) goto L_0x0104
            com.caverock.androidsvg.SVG r2 = r8.svgDocument     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            com.caverock.androidsvg.SVG$Svg r2 = r2.getRootElement()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r2 != 0) goto L_0x0104
            java.lang.String r2 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = "<!ENTITY "
            boolean r2 = r2.contains(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r2 == 0) goto L_0x0104
            java.lang.String r10 = "Switching to SAX parser to process entities"
            android.util.Log.d(r6, r10)     // Catch:{ IOException -> 0x00ce, XmlPullParserException -> 0x0117 }
            r9.reset()     // Catch:{ IOException -> 0x00ce, XmlPullParserException -> 0x0117 }
            r8.parseUsingSAX(r9)     // Catch:{ IOException -> 0x00ce, XmlPullParserException -> 0x0117 }
            goto L_0x00d3
        L_0x00ce:
            java.lang.String r9 = "Detected internal entity definitions, but could not parse them."
            android.util.Log.w(r6, r9)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x00d3:
            return
        L_0x00d4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = "PROC INSTR: "
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            android.util.Log.d(r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            com.caverock.androidsvg.SVGParser$TextScanner r2 = new com.caverock.androidsvg.SVGParser$TextScanner     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = r2.nextToken()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.util.Map r2 = r8.parseProcessingInstructionAttributes(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.handleProcessingInstruction(r5, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0104
        L_0x0101:
            r8.startDocument()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x0104:
            int r2 = r0.nextToken()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x001d
        L_0x010a:
            r8.endDocument()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            return
        L_0x010e:
            r9 = move-exception
            com.caverock.androidsvg.SVGParseException r10 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r0 = "Stream error"
            r10.<init>(r0, r9)
            throw r10
        L_0x0117:
            r9 = move-exception
            com.caverock.androidsvg.SVGParseException r10 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r0 = "XML parser problem"
            r10.<init>(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseUsingXmlPullParser(java.io.InputStream, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.Style.VectorEffect parseVectorEffect(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 3387192(0x33af38, float:4.746467E-39)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 1629199934(0x611b9e3e, float:1.794155E20)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "non-scaling-stroke"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0024
            r3 = r2
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "none"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0024
            r3 = 0
            goto L_0x0025
        L_0x0024:
            r3 = -1
        L_0x0025:
            if (r3 == 0) goto L_0x002e
            if (r3 == r2) goto L_0x002b
            r3 = 0
            return r3
        L_0x002b:
            com.caverock.androidsvg.SVG$Style$VectorEffect r3 = com.caverock.androidsvg.SVG.Style.VectorEffect.NonScalingStroke
            return r3
        L_0x002e:
            com.caverock.androidsvg.SVG$Style$VectorEffect r3 = com.caverock.androidsvg.SVG.Style.VectorEffect.None
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseVectorEffect(java.lang.String):com.caverock.androidsvg.SVG$Style$VectorEffect");
    }

    private static SVG.Box parseViewBox(String str) {
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        float nextFloat = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float nextFloat2 = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float nextFloat3 = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float nextFloat4 = textScanner.nextFloat();
        if (Float.isNaN(nextFloat) || Float.isNaN(nextFloat2) || Float.isNaN(nextFloat3) || Float.isNaN(nextFloat4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        } else if (nextFloat3 < 0.0f) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        } else if (nextFloat4 >= 0.0f) {
            return new SVG.Box(nextFloat, nextFloat2, nextFloat3, nextFloat4);
        } else {
            throw new SVGParseException("Invalid viewBox. height cannot be negative");
        }
    }

    private void path(Attributes attributes) {
        debug("<path>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Path path = new SVG.Path();
            path.document = this.svgDocument;
            path.parent = this.currentElement;
            parseAttributesCore(path, attributes);
            parseAttributesStyle(path, attributes);
            parseAttributesTransform(path, attributes);
            parseAttributesConditional(path, attributes);
            parseAttributesPath(path, attributes);
            this.currentElement.addChild(path);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void pattern(Attributes attributes) {
        debug("<pattern>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Pattern pattern = new SVG.Pattern();
            pattern.document = this.svgDocument;
            pattern.parent = this.currentElement;
            parseAttributesCore(pattern, attributes);
            parseAttributesStyle(pattern, attributes);
            parseAttributesConditional(pattern, attributes);
            parseAttributesViewBox(pattern, attributes);
            parseAttributesPattern(pattern, attributes);
            this.currentElement.addChild(pattern);
            this.currentElement = pattern;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void polygon(Attributes attributes) {
        debug("<polygon>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Polygon polygon = new SVG.Polygon();
            polygon.document = this.svgDocument;
            polygon.parent = this.currentElement;
            parseAttributesCore(polygon, attributes);
            parseAttributesStyle(polygon, attributes);
            parseAttributesTransform(polygon, attributes);
            parseAttributesConditional(polygon, attributes);
            parseAttributesPolyLine(polygon, attributes, "polygon");
            this.currentElement.addChild(polygon);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void polyline(Attributes attributes) {
        debug("<polyline>", new Object[0]);
        if (this.currentElement != null) {
            SVG.PolyLine polyLine = new SVG.PolyLine();
            polyLine.document = this.svgDocument;
            polyLine.parent = this.currentElement;
            parseAttributesCore(polyLine, attributes);
            parseAttributesStyle(polyLine, attributes);
            parseAttributesTransform(polyLine, attributes);
            parseAttributesConditional(polyLine, attributes);
            parseAttributesPolyLine(polyLine, attributes, "polyline");
            this.currentElement.addChild(polyLine);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0244, code lost:
        r5.specifiedFlags = r6 | r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0253, code lost:
        r5.specifiedFlags = r6 | r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void processStyleProperty(com.caverock.androidsvg.SVG.Style r5, java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r7.length()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = "inherit"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0010
            return
        L_0x0010:
            int[] r0 = com.caverock.androidsvg.SVGParser.C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r6)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            java.lang.String r1 = "none"
            java.lang.String r2 = "SVGParser"
            java.lang.String r3 = "currentColor"
            r4 = 124(0x7c, float:1.74E-43)
            switch(r0) {
                case 47: goto L_0x02f2;
                case 48: goto L_0x02e2;
                case 49: goto L_0x02d2;
                case 50: goto L_0x02c3;
                case 51: goto L_0x02b4;
                case 52: goto L_0x02a9;
                case 53: goto L_0x029a;
                case 54: goto L_0x028b;
                case 55: goto L_0x027c;
                case 56: goto L_0x0263;
                case 57: goto L_0x0258;
                case 58: goto L_0x0249;
                case 59: goto L_0x023a;
                case 60: goto L_0x0235;
                case 61: goto L_0x0226;
                case 62: goto L_0x0217;
                case 63: goto L_0x0207;
                case 64: goto L_0x01f7;
                case 65: goto L_0x01e7;
                case 66: goto L_0x01d4;
                case 67: goto L_0x01c3;
                case 68: goto L_0x01b2;
                case 69: goto L_0x019f;
                case 70: goto L_0x0192;
                case 71: goto L_0x0185;
                case 72: goto L_0x0178;
                case 73: goto L_0x0143;
                case 74: goto L_0x010e;
                case 75: goto L_0x00ea;
                case 76: goto L_0x00dd;
                case 77: goto L_0x00cc;
                case 78: goto L_0x00bf;
                case 79: goto L_0x00b2;
                case 80: goto L_0x00a5;
                case 81: goto L_0x0089;
                case 82: goto L_0x007a;
                case 83: goto L_0x005e;
                case 84: goto L_0x004f;
                case 85: goto L_0x003c;
                case 86: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x0302
        L_0x0029:
            com.caverock.androidsvg.SVG$Style$RenderQuality r6 = parseRenderQuality(r7)
            r5.imageRendering = r6
            com.caverock.androidsvg.SVG$Style$RenderQuality r6 = r5.imageRendering
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 137438953472(0x2000000000, double:6.7903865311E-313)
            goto L_0x0253
        L_0x003c:
            com.caverock.androidsvg.SVG$Style$VectorEffect r6 = parseVectorEffect(r7)
            r5.vectorEffect = r6
            com.caverock.androidsvg.SVG$Style$VectorEffect r6 = r5.vectorEffect
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 34359738368(0x800000000, double:1.69759663277E-313)
            goto L_0x0253
        L_0x004f:
            java.lang.Float r6 = parseOpacity(r7)
            r5.viewportFillOpacity = r6
            long r6 = r5.specifiedFlags
            r0 = 17179869184(0x400000000, double:8.4879831639E-314)
            goto L_0x0253
        L_0x005e:
            boolean r6 = r7.equals(r3)
            if (r6 == 0) goto L_0x006b
            com.caverock.androidsvg.SVG$CurrentColor r6 = com.caverock.androidsvg.SVG.CurrentColor.getInstance()
            r5.viewportFill = r6
            goto L_0x0071
        L_0x006b:
            com.caverock.androidsvg.SVG$Colour r6 = parseColour(r7)     // Catch:{ SVGParseException -> 0x0104 }
            r5.viewportFill = r6     // Catch:{ SVGParseException -> 0x0104 }
        L_0x0071:
            long r6 = r5.specifiedFlags
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x0253
        L_0x007a:
            java.lang.Float r6 = parseOpacity(r7)
            r5.solidOpacity = r6
            long r6 = r5.specifiedFlags
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            goto L_0x0253
        L_0x0089:
            boolean r6 = r7.equals(r3)
            if (r6 == 0) goto L_0x0096
            com.caverock.androidsvg.SVG$CurrentColor r6 = com.caverock.androidsvg.SVG.CurrentColor.getInstance()
            r5.solidColor = r6
            goto L_0x009c
        L_0x0096:
            com.caverock.androidsvg.SVG$Colour r6 = parseColour(r7)     // Catch:{ SVGParseException -> 0x0104 }
            r5.solidColor = r6     // Catch:{ SVGParseException -> 0x0104 }
        L_0x009c:
            long r6 = r5.specifiedFlags
            r0 = 2147483648(0x80000000, double:1.0609978955E-314)
            goto L_0x0253
        L_0x00a5:
            java.lang.String r6 = parseFunctionalIRI(r7, r6)
            r5.mask = r6
            long r6 = r5.specifiedFlags
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            goto L_0x0253
        L_0x00b2:
            com.caverock.androidsvg.SVG$Style$FillRule r6 = parseFillRule(r7)
            r5.clipRule = r6
            long r6 = r5.specifiedFlags
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            goto L_0x0253
        L_0x00bf:
            java.lang.String r6 = parseFunctionalIRI(r7, r6)
            r5.clipPath = r6
            long r6 = r5.specifiedFlags
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            goto L_0x0253
        L_0x00cc:
            com.caverock.androidsvg.SVG$CSSClipRect r6 = parseClip(r7)
            r5.clip = r6
            com.caverock.androidsvg.SVG$CSSClipRect r6 = r5.clip
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 1048576(0x100000, double:5.180654E-318)
            goto L_0x0253
        L_0x00dd:
            java.lang.Float r6 = parseOpacity(r7)
            r5.stopOpacity = r6
            long r6 = r5.specifiedFlags
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            goto L_0x0253
        L_0x00ea:
            boolean r6 = r7.equals(r3)
            if (r6 == 0) goto L_0x00f7
            com.caverock.androidsvg.SVG$CurrentColor r6 = com.caverock.androidsvg.SVG.CurrentColor.getInstance()
            r5.stopColor = r6
            goto L_0x00fd
        L_0x00f7:
            com.caverock.androidsvg.SVG$Colour r6 = parseColour(r7)     // Catch:{ SVGParseException -> 0x0104 }
            r5.stopColor = r6     // Catch:{ SVGParseException -> 0x0104 }
        L_0x00fd:
            long r6 = r5.specifiedFlags
            r0 = 67108864(0x4000000, double:3.31561842E-316)
            goto L_0x0253
        L_0x0104:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            android.util.Log.w(r2, r5)
            goto L_0x0302
        L_0x010e:
            int r6 = r7.indexOf(r4)
            if (r6 >= 0) goto L_0x0302
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "|visible|hidden|collapse|"
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L_0x0130
            goto L_0x0302
        L_0x0130:
            java.lang.String r6 = "visible"
            boolean r6 = r7.equals(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.visibility = r6
            long r6 = r5.specifiedFlags
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            goto L_0x0253
        L_0x0143:
            int r6 = r7.indexOf(r4)
            if (r6 >= 0) goto L_0x0302
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L_0x0165
            goto L_0x0302
        L_0x0165:
            boolean r6 = r7.equals(r1)
            r6 = r6 ^ 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.display = r6
            long r6 = r5.specifiedFlags
            r0 = 16777216(0x1000000, double:8.289046E-317)
            goto L_0x0253
        L_0x0178:
            java.lang.String r6 = parseFunctionalIRI(r7, r6)
            r5.markerEnd = r6
            long r6 = r5.specifiedFlags
            r0 = 8388608(0x800000, double:4.144523E-317)
            goto L_0x0253
        L_0x0185:
            java.lang.String r6 = parseFunctionalIRI(r7, r6)
            r5.markerMid = r6
            long r6 = r5.specifiedFlags
            r0 = 4194304(0x400000, double:2.0722615E-317)
            goto L_0x0253
        L_0x0192:
            java.lang.String r6 = parseFunctionalIRI(r7, r6)
            r5.markerStart = r6
            long r6 = r5.specifiedFlags
            r0 = 2097152(0x200000, double:1.0361308E-317)
            goto L_0x0253
        L_0x019f:
            java.lang.String r6 = parseFunctionalIRI(r7, r6)
            r5.markerStart = r6
            java.lang.String r6 = r5.markerStart
            r5.markerMid = r6
            r5.markerEnd = r6
            long r6 = r5.specifiedFlags
            r0 = 14680064(0xe00000, double:7.2529153E-317)
            goto L_0x0253
        L_0x01b2:
            java.lang.Boolean r6 = parseOverflow(r7)
            r5.overflow = r6
            java.lang.Boolean r6 = r5.overflow
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 524288(0x80000, double:2.590327E-318)
            goto L_0x0253
        L_0x01c3:
            com.caverock.androidsvg.SVG$Style$TextAnchor r6 = parseTextAnchor(r7)
            r5.textAnchor = r6
            com.caverock.androidsvg.SVG$Style$TextAnchor r6 = r5.textAnchor
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 262144(0x40000, double:1.295163E-318)
            goto L_0x0253
        L_0x01d4:
            com.caverock.androidsvg.SVG$Style$TextDirection r6 = parseTextDirection(r7)
            r5.direction = r6
            com.caverock.androidsvg.SVG$Style$TextDirection r6 = r5.direction
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 68719476736(0x1000000000, double:3.39519326554E-313)
            goto L_0x0253
        L_0x01e7:
            com.caverock.androidsvg.SVG$Style$TextDecoration r6 = parseTextDecoration(r7)
            r5.textDecoration = r6
            com.caverock.androidsvg.SVG$Style$TextDecoration r6 = r5.textDecoration
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 131072(0x20000, double:6.47582E-319)
            goto L_0x0253
        L_0x01f7:
            com.caverock.androidsvg.SVG$Style$FontStyle r6 = parseFontStyle(r7)
            r5.fontStyle = r6
            com.caverock.androidsvg.SVG$Style$FontStyle r6 = r5.fontStyle
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 65536(0x10000, double:3.2379E-319)
            goto L_0x0253
        L_0x0207:
            java.lang.Integer r6 = parseFontWeight(r7)
            r5.fontWeight = r6
            java.lang.Integer r6 = r5.fontWeight
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 32768(0x8000, double:1.61895E-319)
            goto L_0x0253
        L_0x0217:
            com.caverock.androidsvg.SVG$Length r6 = parseFontSize(r7)
            r5.fontSize = r6
            com.caverock.androidsvg.SVG$Length r6 = r5.fontSize
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 16384(0x4000, double:8.0948E-320)
            goto L_0x0253
        L_0x0226:
            java.util.List r6 = parseFontFamily(r7)
            r5.fontFamily = r6
            java.util.List<java.lang.String> r6 = r5.fontFamily
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 8192(0x2000, double:4.0474E-320)
            goto L_0x0253
        L_0x0235:
            parseFont(r5, r7)
            goto L_0x0302
        L_0x023a:
            com.caverock.androidsvg.SVG$Colour r6 = parseColour(r7)     // Catch:{ SVGParseException -> 0x0302 }
            r5.color = r6     // Catch:{ SVGParseException -> 0x0302 }
            long r6 = r5.specifiedFlags     // Catch:{ SVGParseException -> 0x0302 }
            r0 = 4096(0x1000, double:2.0237E-320)
        L_0x0244:
            long r6 = r6 | r0
            r5.specifiedFlags = r6     // Catch:{ SVGParseException -> 0x0302 }
            goto L_0x0302
        L_0x0249:
            java.lang.Float r6 = parseOpacity(r7)
            r5.opacity = r6
            long r6 = r5.specifiedFlags
            r0 = 2048(0x800, double:1.0118E-320)
        L_0x0253:
            long r6 = r6 | r0
            r5.specifiedFlags = r6
            goto L_0x0302
        L_0x0258:
            com.caverock.androidsvg.SVG$Length r6 = parseLength(r7)     // Catch:{ SVGParseException -> 0x0302 }
            r5.strokeDashOffset = r6     // Catch:{ SVGParseException -> 0x0302 }
            long r6 = r5.specifiedFlags     // Catch:{ SVGParseException -> 0x0302 }
            r0 = 1024(0x400, double:5.06E-321)
            goto L_0x0244
        L_0x0263:
            boolean r6 = r1.equals(r7)
            r0 = 512(0x200, double:2.53E-321)
            if (r6 == 0) goto L_0x0271
            r6 = 0
            r5.strokeDashArray = r6
        L_0x026e:
            long r6 = r5.specifiedFlags
            goto L_0x0253
        L_0x0271:
            com.caverock.androidsvg.SVG$Length[] r6 = parseStrokeDashArray(r7)
            r5.strokeDashArray = r6
            com.caverock.androidsvg.SVG$Length[] r6 = r5.strokeDashArray
            if (r6 == 0) goto L_0x0302
            goto L_0x026e
        L_0x027c:
            float r6 = parseFloat(r7)     // Catch:{ SVGParseException -> 0x0302 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ SVGParseException -> 0x0302 }
            r5.strokeMiterLimit = r6     // Catch:{ SVGParseException -> 0x0302 }
            long r6 = r5.specifiedFlags     // Catch:{ SVGParseException -> 0x0302 }
            r0 = 256(0x100, double:1.265E-321)
            goto L_0x0244
        L_0x028b:
            com.caverock.androidsvg.SVG$Style$LineJoin r6 = parseStrokeLineJoin(r7)
            r5.strokeLineJoin = r6
            com.caverock.androidsvg.SVG$Style$LineJoin r6 = r5.strokeLineJoin
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 128(0x80, double:6.32E-322)
            goto L_0x0253
        L_0x029a:
            com.caverock.androidsvg.SVG$Style$LineCap r6 = parseStrokeLineCap(r7)
            r5.strokeLineCap = r6
            com.caverock.androidsvg.SVG$Style$LineCap r6 = r5.strokeLineCap
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 64
            goto L_0x0253
        L_0x02a9:
            com.caverock.androidsvg.SVG$Length r6 = parseLength(r7)     // Catch:{ SVGParseException -> 0x0302 }
            r5.strokeWidth = r6     // Catch:{ SVGParseException -> 0x0302 }
            long r6 = r5.specifiedFlags     // Catch:{ SVGParseException -> 0x0302 }
            r0 = 32
            goto L_0x0244
        L_0x02b4:
            java.lang.Float r6 = parseOpacity(r7)
            r5.strokeOpacity = r6
            java.lang.Float r6 = r5.strokeOpacity
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 16
            goto L_0x0253
        L_0x02c3:
            com.caverock.androidsvg.SVG$SvgPaint r6 = parsePaintSpecifier(r7)
            r5.stroke = r6
            com.caverock.androidsvg.SVG$SvgPaint r6 = r5.stroke
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 8
            goto L_0x0253
        L_0x02d2:
            java.lang.Float r6 = parseOpacity(r7)
            r5.fillOpacity = r6
            java.lang.Float r6 = r5.fillOpacity
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 4
            goto L_0x0253
        L_0x02e2:
            com.caverock.androidsvg.SVG$Style$FillRule r6 = parseFillRule(r7)
            r5.fillRule = r6
            com.caverock.androidsvg.SVG$Style$FillRule r6 = r5.fillRule
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 2
            goto L_0x0253
        L_0x02f2:
            com.caverock.androidsvg.SVG$SvgPaint r6 = parsePaintSpecifier(r7)
            r5.fill = r6
            com.caverock.androidsvg.SVG$SvgPaint r6 = r5.fill
            if (r6 == 0) goto L_0x0302
            long r6 = r5.specifiedFlags
            r0 = 1
            goto L_0x0253
        L_0x0302:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.processStyleProperty(com.caverock.androidsvg.SVG$Style, java.lang.String, java.lang.String):void");
    }

    private void radialGradient(Attributes attributes) {
        debug("<radialGradient>", new Object[0]);
        if (this.currentElement != null) {
            SVG.SvgRadialGradient svgRadialGradient = new SVG.SvgRadialGradient();
            svgRadialGradient.document = this.svgDocument;
            svgRadialGradient.parent = this.currentElement;
            parseAttributesCore(svgRadialGradient, attributes);
            parseAttributesStyle(svgRadialGradient, attributes);
            parseAttributesGradient(svgRadialGradient, attributes);
            parseAttributesRadialGradient(svgRadialGradient, attributes);
            this.currentElement.addChild(svgRadialGradient);
            this.currentElement = svgRadialGradient;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void rect(Attributes attributes) {
        debug("<rect>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Rect rect = new SVG.Rect();
            rect.document = this.svgDocument;
            rect.parent = this.currentElement;
            parseAttributesCore(rect, attributes);
            parseAttributesStyle(rect, attributes);
            parseAttributesTransform(rect, attributes);
            parseAttributesConditional(rect, attributes);
            parseAttributesRect(rect, attributes);
            this.currentElement.addChild(rect);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void solidColor(Attributes attributes) {
        debug("<solidColor>", new Object[0]);
        if (this.currentElement != null) {
            SVG.SolidColor solidColor = new SVG.SolidColor();
            solidColor.document = this.svgDocument;
            solidColor.parent = this.currentElement;
            parseAttributesCore(solidColor, attributes);
            parseAttributesStyle(solidColor, attributes);
            this.currentElement.addChild(solidColor);
            this.currentElement = solidColor;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* access modifiers changed from: private */
    public void startDocument() {
        this.svgDocument = new SVG();
    }

    /* access modifiers changed from: private */
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (this.ignoring) {
            this.ignoreDepth++;
        } else if (SVG_NAMESPACE.equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            SVGElem fromString = SVGElem.fromString(str2);
            switch (C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[fromString.ordinal()]) {
                case 1:
                    svg(attributes);
                    return;
                case 2:
                case 3:
                    m6453g(attributes);
                    return;
                case 4:
                    defs(attributes);
                    return;
                case 5:
                    use(attributes);
                    return;
                case 6:
                    path(attributes);
                    return;
                case 7:
                    rect(attributes);
                    return;
                case 8:
                    circle(attributes);
                    return;
                case 9:
                    ellipse(attributes);
                    return;
                case 10:
                    line(attributes);
                    return;
                case 11:
                    polyline(attributes);
                    return;
                case 12:
                    polygon(attributes);
                    return;
                case 13:
                    text(attributes);
                    return;
                case 14:
                    tspan(attributes);
                    return;
                case 15:
                    tref(attributes);
                    return;
                case 16:
                    zwitch(attributes);
                    return;
                case 17:
                    symbol(attributes);
                    return;
                case 18:
                    marker(attributes);
                    return;
                case 19:
                    linearGradient(attributes);
                    return;
                case 20:
                    radialGradient(attributes);
                    return;
                case 21:
                    stop(attributes);
                    return;
                case 22:
                case 23:
                    this.inMetadataElement = true;
                    this.metadataTag = fromString;
                    return;
                case 24:
                    clipPath(attributes);
                    return;
                case 25:
                    textPath(attributes);
                    return;
                case 26:
                    pattern(attributes);
                    return;
                case 27:
                    image(attributes);
                    return;
                case 28:
                    view(attributes);
                    return;
                case 29:
                    mask(attributes);
                    return;
                case 30:
                    style(attributes);
                    return;
                case 31:
                    solidColor(attributes);
                    return;
                default:
                    this.ignoring = true;
                    this.ignoreDepth = 1;
                    return;
            }
        }
    }

    private void stop(Attributes attributes) {
        debug("<stop>", new Object[0]);
        SVG.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        } else if (svgContainer instanceof SVG.GradientElement) {
            SVG.Stop stop = new SVG.Stop();
            stop.document = this.svgDocument;
            stop.parent = this.currentElement;
            parseAttributesCore(stop, attributes);
            parseAttributesStyle(stop, attributes);
            parseAttributesStop(stop, attributes);
            this.currentElement.addChild(stop);
            this.currentElement = stop;
        } else {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
    }

    private void style(Attributes attributes) {
        debug("<style>", new Object[0]);
        if (this.currentElement != null) {
            String str = XML_STYLESHEET_ATTR_MEDIA_ALL;
            boolean z = true;
            for (int i = 0; i < attributes.getLength(); i++) {
                String trim = attributes.getValue(i).trim();
                int i2 = C13331.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (i2 == 88) {
                    z = trim.equals("text/css");
                } else if (i2 == 89) {
                    str = trim;
                }
            }
            if (!z || !CSSParser.mediaMatches(str, CSSParser.MediaType.screen)) {
                this.ignoring = true;
                this.ignoreDepth = 1;
                return;
            }
            this.inStyleElement = true;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void svg(Attributes attributes) {
        debug("<svg>", new Object[0]);
        SVG.Svg svg = new SVG.Svg();
        svg.document = this.svgDocument;
        svg.parent = this.currentElement;
        parseAttributesCore(svg, attributes);
        parseAttributesStyle(svg, attributes);
        parseAttributesConditional(svg, attributes);
        parseAttributesViewBox(svg, attributes);
        parseAttributesSVG(svg, attributes);
        SVG.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            this.svgDocument.setRootElement(svg);
        } else {
            svgContainer.addChild(svg);
        }
        this.currentElement = svg;
    }

    private void symbol(Attributes attributes) {
        debug("<symbol>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Symbol symbol = new SVG.Symbol();
            symbol.document = this.svgDocument;
            symbol.parent = this.currentElement;
            parseAttributesCore(symbol, attributes);
            parseAttributesStyle(symbol, attributes);
            parseAttributesConditional(symbol, attributes);
            parseAttributesViewBox(symbol, attributes);
            this.currentElement.addChild(symbol);
            this.currentElement = symbol;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* access modifiers changed from: private */
    public void text(String str) {
        StringBuilder sb;
        if (!this.ignoring) {
            if (this.inMetadataElement) {
                if (this.metadataElementContents == null) {
                    this.metadataElementContents = new StringBuilder(str.length());
                }
                sb = this.metadataElementContents;
            } else if (this.inStyleElement) {
                if (this.styleElementContents == null) {
                    this.styleElementContents = new StringBuilder(str.length());
                }
                sb = this.styleElementContents;
            } else if (this.currentElement instanceof SVG.TextContainer) {
                appendToTextContainer(str);
                return;
            } else {
                return;
            }
            sb.append(str);
        }
    }

    private void text(Attributes attributes) {
        debug("<text>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Text text = new SVG.Text();
            text.document = this.svgDocument;
            text.parent = this.currentElement;
            parseAttributesCore(text, attributes);
            parseAttributesStyle(text, attributes);
            parseAttributesTransform(text, attributes);
            parseAttributesConditional(text, attributes);
            parseAttributesTextPosition(text, attributes);
            this.currentElement.addChild(text);
            this.currentElement = text;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void text(char[] cArr, int i, int i2) {
        StringBuilder sb;
        if (!this.ignoring) {
            if (this.inMetadataElement) {
                if (this.metadataElementContents == null) {
                    this.metadataElementContents = new StringBuilder(i2);
                }
                sb = this.metadataElementContents;
            } else if (this.inStyleElement) {
                if (this.styleElementContents == null) {
                    this.styleElementContents = new StringBuilder(i2);
                }
                sb = this.styleElementContents;
            } else if (this.currentElement instanceof SVG.TextContainer) {
                appendToTextContainer(new String(cArr, i, i2));
                return;
            } else {
                return;
            }
            sb.append(cArr, i, i2);
        }
    }

    private void textPath(Attributes attributes) {
        debug("<textPath>", new Object[0]);
        if (this.currentElement != null) {
            SVG.TextPath textPath = new SVG.TextPath();
            textPath.document = this.svgDocument;
            textPath.parent = this.currentElement;
            parseAttributesCore(textPath, attributes);
            parseAttributesStyle(textPath, attributes);
            parseAttributesConditional(textPath, attributes);
            parseAttributesTextPath(textPath, attributes);
            this.currentElement.addChild(textPath);
            this.currentElement = textPath;
            SVG.SvgContainer svgContainer = textPath.parent;
            textPath.setTextRoot(svgContainer instanceof SVG.TextRoot ? (SVG.TextRoot) svgContainer : ((SVG.TextChild) svgContainer).getTextRoot());
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void tref(Attributes attributes) {
        debug("<tref>", new Object[0]);
        SVG.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        } else if (svgContainer instanceof SVG.TextContainer) {
            SVG.TRef tRef = new SVG.TRef();
            tRef.document = this.svgDocument;
            tRef.parent = this.currentElement;
            parseAttributesCore(tRef, attributes);
            parseAttributesStyle(tRef, attributes);
            parseAttributesConditional(tRef, attributes);
            parseAttributesTRef(tRef, attributes);
            this.currentElement.addChild(tRef);
            SVG.SvgContainer svgContainer2 = tRef.parent;
            tRef.setTextRoot(svgContainer2 instanceof SVG.TextRoot ? (SVG.TextRoot) svgContainer2 : ((SVG.TextChild) svgContainer2).getTextRoot());
        } else {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
    }

    private void tspan(Attributes attributes) {
        debug("<tspan>", new Object[0]);
        SVG.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        } else if (svgContainer instanceof SVG.TextContainer) {
            SVG.TSpan tSpan = new SVG.TSpan();
            tSpan.document = this.svgDocument;
            tSpan.parent = this.currentElement;
            parseAttributesCore(tSpan, attributes);
            parseAttributesStyle(tSpan, attributes);
            parseAttributesConditional(tSpan, attributes);
            parseAttributesTextPosition(tSpan, attributes);
            this.currentElement.addChild(tSpan);
            this.currentElement = tSpan;
            SVG.SvgContainer svgContainer2 = tSpan.parent;
            tSpan.setTextRoot(svgContainer2 instanceof SVG.TextRoot ? (SVG.TextRoot) svgContainer2 : ((SVG.TextChild) svgContainer2).getTextRoot());
        } else {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
    }

    private void use(Attributes attributes) {
        debug("<use>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Use use = new SVG.Use();
            use.document = this.svgDocument;
            use.parent = this.currentElement;
            parseAttributesCore(use, attributes);
            parseAttributesStyle(use, attributes);
            parseAttributesTransform(use, attributes);
            parseAttributesConditional(use, attributes);
            parseAttributesUse(use, attributes);
            this.currentElement.addChild(use);
            this.currentElement = use;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void view(Attributes attributes) {
        debug("<view>", new Object[0]);
        if (this.currentElement != null) {
            SVG.View view = new SVG.View();
            view.document = this.svgDocument;
            view.parent = this.currentElement;
            parseAttributesCore(view, attributes);
            parseAttributesConditional(view, attributes);
            parseAttributesViewBox(view, attributes);
            this.currentElement.addChild(view);
            this.currentElement = view;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void zwitch(Attributes attributes) {
        debug("<switch>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Switch switchR = new SVG.Switch();
            switchR.document = this.svgDocument;
            switchR.parent = this.currentElement;
            parseAttributesCore(switchR, attributes);
            parseAttributesStyle(switchR, attributes);
            parseAttributesTransform(switchR, attributes);
            parseAttributesConditional(switchR, attributes);
            this.currentElement.addChild(switchR);
            this.currentElement = switchR;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* access modifiers changed from: package-private */
    public SVG parse(BufferedInputStream bufferedInputStream, boolean z) {
        if (!bufferedInputStream.markSupported()) {
            bufferedInputStream = new BufferedInputStream(bufferedInputStream);
        }
        try {
            bufferedInputStream.mark(3);
            int read = bufferedInputStream.read() + (bufferedInputStream.read() << 8);
            bufferedInputStream.reset();
            if (read == 35615) {
                bufferedInputStream = new BufferedInputStream(new GZIPInputStream(bufferedInputStream));
            }
        } catch (IOException unused) {
        }
        try {
            bufferedInputStream.mark(ENTITY_WATCH_BUFFER_SIZE);
            parseUsingXmlPullParser(bufferedInputStream, z);
            return this.svgDocument;
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException unused2) {
                Log.e(TAG, "Exception thrown closing input stream");
            }
        }
    }
}
