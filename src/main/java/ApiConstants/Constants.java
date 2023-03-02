package ApiConstants;

import static utils.PropReader.readConfig;

public class Constants {

    public static final int CODE_200;
    public static final String CURRENCY;
    public static final String SEARCH_URL;
    public static final String LookUp_URL;

    static {
        CODE_200=200;
        CURRENCY="SAR";
        SEARCH_URL=readConfig("url")+"/accommodation/property/search";
        LookUp_URL=readConfig("url")+"/accommodation/property/search";
    }
}
