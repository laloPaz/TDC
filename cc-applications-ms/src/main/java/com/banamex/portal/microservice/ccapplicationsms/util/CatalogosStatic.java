package com.banamex.portal.microservice.ccapplicationsms.util;

import java.util.HashMap;

import org.apache.log4j.Logger;

public class CatalogosStatic {
	
private static Logger log = Logger.getLogger(CatalogosStatic.class);
	
	public static HashMap<String, Object> getcatalogos; // catalogos para el front
	public static HashMap<String, String> status = new HashMap<String, String>();
	public static HashMap<String, String> preaprobada = new HashMap<String, String>();
	public static HashMap<String, String> declinamsg = new HashMap<String, String>();
	
	
	
	public static void cargaCatalogos(){
		log.info("inicia cargaCatalogos estaticos");
		
        getcatalogos = new HashMap<String, Object>();
        
        HashMap<String, String> genero = new HashMap<String, String>();
        HashMap<String, String> nacionalidad = new HashMap<String, String>();
        HashMap<String, String> tipo_vivienda = new HashMap<String, String>();
        HashMap<String, String> giro_empresa = new HashMap<String, String>();
        HashMap<String, String> profesion = new HashMap<String, String>();
        HashMap<String, String> comercio = new HashMap<String, String>();
        HashMap<String, String> banco = new HashMap<String, String>();
  
        
        status.put("3*7", "En progreso");
        status.put("39*71", "En progreso");
        status.put("40*71", "En progreso");
        status.put("2*7", "En progreso");
        status.put("41*71", "Aprobada");
        status.put("38*7", "Aprobada");
        status.put("15*71", "En progreso");
        status.put("29*13", "En progreso");
        status.put("29*12", "En progreso");
        status.put("4*7", "En progreso");
        status.put("14*a", "En progreso");
        status.put("28*44", "En progreso");
        status.put("38*44", "Aprobada");
        status.put("28*73", "Tarjeta Asignada");
        status.put("a*75", "Declinada");
        status.put("a*53", "Declinada");
        status.put("11*7", "Aprobada");
        status.put("42*71", "En progreso");
        status.put("43*71", "En progreso");
        status.put("44*71", "En progreso");
        status.put("a*3", "En progreso");
        status.put("7*71", "En progreso");
    //    status.put("*", "Error Generico");
   //     status.put("", "Error  Generico");
        

        preaprobada.put("Aprobada", "1");
        preaprobada.put("Tarjeta Asignada", "1");
        preaprobada.put("Declinada", "2");
        
   


        declinamsg.put("800A", "3");
        declinamsg.put("800B", "3");
        declinamsg.put("800C", "3");
        declinamsg.put("800D", "3");
        declinamsg.put("800E", "3");
        declinamsg.put("800F", "3");
        declinamsg.put("800G", "3");
        declinamsg.put("800H", "3");
        declinamsg.put("800I", "3");
        declinamsg.put("800J", "3");
        declinamsg.put("800K", "3");
        declinamsg.put("800L", "3");
        declinamsg.put("800M", "3");
        declinamsg.put("800N", "3");
        declinamsg.put("800O", "3");
        declinamsg.put("800P", "3");
        declinamsg.put("800Q", "3");
        declinamsg.put("800Z", "3");
        declinamsg.put("A001", "3");
        declinamsg.put("A002", "3");
        declinamsg.put("A003", "3");
        declinamsg.put("A005", "98");
        declinamsg.put("A006", "3");
        declinamsg.put("AGE1", "3");
        declinamsg.put("AGE2", "3");
        declinamsg.put("AGE3", "3");
        declinamsg.put("AMI1", "99");
        declinamsg.put("AMUE", "5");
        declinamsg.put("AUTH", "14");
        declinamsg.put("BB01", "6");
        declinamsg.put("BB02", "6");
        declinamsg.put("BB03", "6");
        declinamsg.put("BB04", "6");
        declinamsg.put("BB06", "6");
        declinamsg.put("BB07", "6");
        declinamsg.put("BB08", "6");
        declinamsg.put("BB09", "6");
        declinamsg.put("BB10", "6");
        declinamsg.put("BL01", "3");
        declinamsg.put("BPC1", "5");
        declinamsg.put("BSMA", "4");
        declinamsg.put("CL01", "3");
        declinamsg.put("D001", "3");
        declinamsg.put("D002", "3");
        declinamsg.put("D003", "99");
        declinamsg.put("D004", "99");
        declinamsg.put("D005", "98");
        declinamsg.put("D006", "99");
        declinamsg.put("DMEG", "3");
        declinamsg.put("DMEJ", "6");
        declinamsg.put("DMEP", "6");
        declinamsg.put("DMPZ", "3");
        declinamsg.put("DNH1", "13");
        declinamsg.put("DPE2", "3");
        declinamsg.put("GI01", "3");
        declinamsg.put("IB01", "3");
        declinamsg.put("IB02", "3");
        declinamsg.put("IB03", "6");
        declinamsg.put("IB04", "6");
        declinamsg.put("ID01", "3");
        declinamsg.put("ID02", "3");
        declinamsg.put("ME01", "3");
        declinamsg.put("ME02", "3");
        declinamsg.put("ME02", "6");
        declinamsg.put("ME02", "3");
        declinamsg.put("ME03", "3");
        declinamsg.put("ME04", "3");
        declinamsg.put("ME06", "3");
        declinamsg.put("ME08", "3");
        declinamsg.put("ME09", "3");
        declinamsg.put("ME11", "3");
        declinamsg.put("ME12", "3");
        declinamsg.put("ME13", "6");
        declinamsg.put("ME14", "3");
        declinamsg.put("ME16", "6");
        declinamsg.put("ME18", "6");
        declinamsg.put("ME18", "3");
        declinamsg.put("ME20", "3");
        declinamsg.put("ME23", "3");
        declinamsg.put("ME24", "98");
        declinamsg.put("ME26", "3");
        declinamsg.put("ME28", "3");
        declinamsg.put("ME33", "3");
        declinamsg.put("MF01", "3");
        declinamsg.put("MF02", "3");
        declinamsg.put("MF03", "3");
        declinamsg.put("MP01", "3");
        declinamsg.put("MP02", "3");
        declinamsg.put("MP03", "3");
        declinamsg.put("MP04", "3");
        declinamsg.put("MP05", "3");
        declinamsg.put("MP06", "3");
        declinamsg.put("MP08", "3");
        declinamsg.put("MP09", "3");
        declinamsg.put("MP10", "3");
        declinamsg.put("MP12", "3");
        declinamsg.put("MP13", "3");
        declinamsg.put("MP16", "3");
        declinamsg.put("MP20", "3");
        declinamsg.put("MP21", "3");
        declinamsg.put("MP21", "3");
        declinamsg.put("MP25", "3");
        declinamsg.put("MP27", "3");
        declinamsg.put("MP29", "3");
        declinamsg.put("MP34", "3");
        declinamsg.put("MP35", "3");
        declinamsg.put("MP36", "3");
        declinamsg.put("MP40", "3");
        declinamsg.put("MT01", "3");
        declinamsg.put("MT02", "3");
        declinamsg.put("MT03", "3");
        declinamsg.put("MT04", "3");
        declinamsg.put("MT05", "3");
        declinamsg.put("MT06", "3");
        declinamsg.put("MT08", "3");
        declinamsg.put("MT09", "3");
        declinamsg.put("MT10", "3");
        declinamsg.put("MT13", "3");
        declinamsg.put("MT15", "3");
        declinamsg.put("MT18", "3");
        declinamsg.put("MT19", "3");
        declinamsg.put("MT20", "3");
        declinamsg.put("MT21", "3");
        declinamsg.put("MT22", "3");
        declinamsg.put("MT23", "3");
        declinamsg.put("NH01", "13");
        declinamsg.put("NT01", "98");
        declinamsg.put("OC01", "3");
        declinamsg.put("PC02", "5");
        declinamsg.put("PC03", "5");
        declinamsg.put("TVRE", "4");
        
        declinamsg.put("PPW1", "5");
        declinamsg.put("SC01", "3");
        declinamsg.put("TVAP", "3");
        declinamsg.put("ICL1", "5");
        declinamsg.put("PC01", "5");
        declinamsg.put("MP28", "13");
        declinamsg.put("MP33", "13");
        declinamsg.put("ME15", "98");
        declinamsg.put("ME27", "13");
        declinamsg.put("MT17", "13");
        declinamsg.put("MP07", "13");
        declinamsg.put("ME10", "98");
        declinamsg.put("MP31", "98");
        declinamsg.put("ME17", "13");
        declinamsg.put("MP24", "13");
        declinamsg.put("MP38", "13");
        declinamsg.put("MP39", "13");
        declinamsg.put("MP11", "13");
        declinamsg.put("MP18", "13");
        declinamsg.put("MP15", "98");
        declinamsg.put("MT16", "13");
        declinamsg.put("MT12", "13");
        declinamsg.put("MT14", "13");
        declinamsg.put("ME19", "13");
        declinamsg.put("ME29", "13");
        declinamsg.put("ME32", "13");
        declinamsg.put("ME05", "13");
        declinamsg.put("ZZ01", "13");
        declinamsg.put("MUE1", "5");
        declinamsg.put("MI01", "5");
        declinamsg.put("ANT1", "3");
        declinamsg.put("ANT2", "3");
        declinamsg.put("XSEL", "3");
        declinamsg.put("RL01", "3");
        declinamsg.put("PRF1", "3");
        declinamsg.put("SC02", "3");
        declinamsg.put("OC02", "3");
        declinamsg.put("NH02", "13");
        declinamsg.put("PDRO", "3");
        declinamsg.put("PRO1", "13");
        declinamsg.put("PRO2", "13");
        declinamsg.put("QRY1", "3");
        declinamsg.put("AMI2", "3");
        declinamsg.put("EEEE", "3");
        declinamsg.put("ANS1", "3");
        declinamsg.put("ME21", "3");
        declinamsg.put("BB11", "6");
        declinamsg.put("CL02", "5");
        declinamsg.put("AMI3", "3");
        declinamsg.put("CL03", "3");
        declinamsg.put("PEBM", "3");
        declinamsg.put("PDR2", "3");
        
        //catalogo para 16 id
        
        //------------------------
        genero.put("Masculino","M");
        genero.put("Femenino","F");
        
        tipo_vivienda.put("De un familiar","4");
        tipo_vivienda.put("Hipotecada","2");
        tipo_vivienda.put("Propia","1");
        tipo_vivienda.put("Rentada","3");
        
        banco.put("AMERICAN EXPRESS","103");
        banco.put("BANAMEX","2");
        banco.put("BANCA AFIRME","62");
        banco.put("BANCO DEL BAJIO","30");
        banco.put("BANCO GE CAPITAL","22");
        banco.put("BANCO MIFEL","42");
        banco.put("BANCO UNION","8");
        banco.put("BANJERCITO","19");
        banco.put("BANORTE","72");
        banco.put("BANREGIO","58");
        banco.put("BBVA BANCOMER","12");
        banco.put("CITI BANK","7");
        banco.put("HSBC","21");
        banco.put("INBURSA","36");
        banco.put("INVEX","59");
        banco.put("IXE BANCO","32");
        banco.put("SANTANDER - SERFIN","3");
        banco.put("SCOTIABANK INVERLAT","44");

        
        profesion.put("ALTO EJECUTIVO PRIVADO","5");
        profesion.put("ALTO EJECUTIVO PUBLICO","8");
        profesion.put("AMA DE CASA","22");
        profesion.put("COMERCIANTE","2");
        profesion.put("EMPLEADO SECTOR PRIVADO","6");
        profesion.put("EMPLEADO SECTOR PUBLICO","9");
        profesion.put("ESTUDIANTE","21");
        profesion.put("JUBILADO / PENSIONADO","20");
        profesion.put("NEGOCIO PROPIO","2");
        profesion.put("PROFESIONISTA","4");

        comercio.put("CyA","999");
        comercio.put("COMERCIAL MEXICANA","48");
        comercio.put("CREDIMATICO","52");
        comercio.put("F���BRICAS DE FRANCIA","999");
        comercio.put("HEB","78");
        comercio.put("HERMANOS VAZQUEZ","79");
        comercio.put("LIVERPOOL","999");
        comercio.put("PALACIO DE HIERRO","999");
        comercio.put("SEARS","999");
        comercio.put("SORIANA","125");
        comercio.put("SUBURBIA","127");
        comercio.put("WALMART","158");
        comercio.put("WOOLWORTH","159");
        comercio.put("OTROS","999");

        
        giro_empresa.put("AGRICULTURA","871100");
        giro_empresa.put("AMA DE CASA","594700");
        giro_empresa.put("COMERCIO MAYORISTA","524110");
        giro_empresa.put("COMERCIO MINORISTA","593200");
        giro_empresa.put("CONSTRUCCION","152");
        giro_empresa.put("FINANCIERO","601100");
        giro_empresa.put("GOBIERNO","931100");
        giro_empresa.put("HOSPEDAJE","701100");
        giro_empresa.put("INDUSTRIA MANUFACTURERA","275200");
        giro_empresa.put("JUBILADO / PENSIONADO","931100");
        giro_empresa.put("RESTAURANTES","771210");
        giro_empresa.put("SERVICIOS","874100");
        giro_empresa.put("SERVICIOS EDUCATIVOS","822200");
        giro_empresa.put("SERVICIOS MEDICOS","806900");
        giro_empresa.put("TRANSPORTE","421");

        
        nacionalidad.put("MEXICO","1");
        nacionalidad.put("AFGANISTAN","5");
        nacionalidad.put("ALAND ISLAND","209");
        nacionalidad.put("ALBANIA","8");
        nacionalidad.put("ALEMANIA","47");
        nacionalidad.put("AMERICAN SAMOA (US)","210");
        nacionalidad.put("ANDORRA","2");
        nacionalidad.put("ANGOLA","10");
        nacionalidad.put("ANGUILA","7");
        nacionalidad.put("ANTARCTICA","211");
        nacionalidad.put("ANTIGUA Y BA","6");
        nacionalidad.put("ANTILLAS HOL","9");
        nacionalidad.put("ARABIA SAUDI","160");
        nacionalidad.put("ARGELIA","52");
        nacionalidad.put("ARGENTINA","11");
        nacionalidad.put("ARMENIA","207");
        nacionalidad.put("ARUBA","14");
        nacionalidad.put("AUSTRALIA","13");
        nacionalidad.put("AUSTRIA","12");
        nacionalidad.put("AZERBAIJAN","213");
        nacionalidad.put("BAHAMAS","27");
        nacionalidad.put("BAHRAIN","20");
        nacionalidad.put("BANGLADES","16");
        nacionalidad.put("BARBADOS","15");
        nacionalidad.put("BELARUS","29");
        nacionalidad.put("BELGICA","17");
        nacionalidad.put("BELICE","30");
        nacionalidad.put("BENIN","22");
        nacionalidad.put("BERMUDA","23");
        nacionalidad.put("BHUTAN","214");
        nacionalidad.put("BOLIVIA","25");
        nacionalidad.put("BOSNIA Y HERZEGOVINA","255");
        nacionalidad.put("BOTSWANA","28");
        nacionalidad.put("BOUVET ISLAND","215");
        nacionalidad.put("BR INDIAN OCEAN TERR","216");
        nacionalidad.put("BRASIL","26");
        nacionalidad.put("BRUNEI","24");
        nacionalidad.put("BULGARIA","19");
        nacionalidad.put("BURKINA FASO","18");
        nacionalidad.put("BURUNDI","21");
        nacionalidad.put("CABO VERDE","44");
        nacionalidad.put("CAMBODIA","217");
        nacionalidad.put("CAMBOYA","32");
        nacionalidad.put("CAMERUN","39");
        nacionalidad.put("CANADA","31");
        nacionalidad.put("CD VATICANO","191");
        nacionalidad.put("CHAD","218");
        nacionalidad.put("CHANNEL IS","94");
        nacionalidad.put("CHILE","38");
        nacionalidad.put("CHINA","40");
        nacionalidad.put("CHIPRE","45");
        nacionalidad.put("CHRISTMAS ISLAND","219");
        nacionalidad.put("COCOS KEELING ISLAND","220");
        nacionalidad.put("COLOMBIA","41");
        nacionalidad.put("COMOROS","221");
        nacionalidad.put("CONGO","34");
        nacionalidad.put("CONGO DEMOCRATIC REP","222");
        nacionalidad.put("COREA","102");
        nacionalidad.put("COSTA MARFIL","36");
        nacionalidad.put("COSTA RICA","42");
        nacionalidad.put("CROACIA","82");
        nacionalidad.put("CUBA","43");
        nacionalidad.put("DINAMARCA","49");
        nacionalidad.put("DJIBOUTI","48");
        nacionalidad.put("DOMINICA","50");
        nacionalidad.put("ECUADOR","54");
        nacionalidad.put("EGIPTO","56");
        nacionalidad.put("EL SALVADOR","174");
        nacionalidad.put("EMIR ARABES UNIDOS","4");
        nacionalidad.put("EQUATORIAL GUINEA","223");
        nacionalidad.put("ERITREA","224");
        nacionalidad.put("ESCOCIA","53");
        nacionalidad.put("ESPANA","57");
        nacionalidad.put("ESTADOS UNIDOS","3");
        nacionalidad.put("ESTONIA","55");
        nacionalidad.put("ETIOPIA","58");
        nacionalidad.put("FALK ISLAS-MALVINAS","225");
        nacionalidad.put("FIJI","60");
        nacionalidad.put("FILIPINAS","148");
        nacionalidad.put("FINLANDIA","59");
        nacionalidad.put("FRANCIA","62");
        nacionalidad.put("FRENCH SOUTHERN TERR","226");
        nacionalidad.put("GABON","63");
        nacionalidad.put("GALES","75");
        nacionalidad.put("GAMBIA","71");
        nacionalidad.put("GEORGIA","227");
        nacionalidad.put("GHANA","68");
        nacionalidad.put("GIBRALTAR","69");
        nacionalidad.put("GRECIA","74");
        nacionalidad.put("GREENLAND","70");
        nacionalidad.put("GRENADA","65");
        nacionalidad.put("GUADALUPE","73");
        nacionalidad.put("GUAM","77");
        nacionalidad.put("GUATEMALA","76");
        nacionalidad.put("GUERNSEY C.I","67");
        nacionalidad.put("GUINEA","72");
        nacionalidad.put("GUINEA FRANC","66");
        nacionalidad.put("GUINEA-BISSA","78");
        nacionalidad.put("GUYANA","79");
        nacionalidad.put("HAITI","83");
        nacionalidad.put("HOLANDA","137");
        nacionalidad.put("HONDURAS","81");
        nacionalidad.put("HONG KONG","80");
        nacionalidad.put("HUNGRIA","84");
        nacionalidad.put("I DEL HOMBRE","88");
        nacionalidad.put("I VIRGENES A","195");
        nacionalidad.put("I VIRGENES B","194");
        nacionalidad.put("INDIA","89");
        nacionalidad.put("INDONESIA","85");
        nacionalidad.put("INGLATERRA","64");
        nacionalidad.put("IRAQ","90");
        nacionalidad.put("IRLANDA","86");
        nacionalidad.put("IS MARIANA","122");
        nacionalidad.put("IS SALOMON","161");
        nacionalidad.put("ISLANDIA","92");
        nacionalidad.put("ISLAS COOK","37");
        nacionalidad.put("ISLAS CAIMAN","104");
        nacionalidad.put("ISLAS FAROE","61");
        nacionalidad.put("ISLAS HEARD-MCDONALD","228");
        nacionalidad.put("ISRAEL","87");
        nacionalidad.put("ITALIA","93");
        nacionalidad.put("JAMAICA","95");
        nacionalidad.put("JAPON","97");
        nacionalidad.put("JORDANIA","96");
        nacionalidad.put("KAZAKHSTAN","99");
        nacionalidad.put("KAZAKHSTAN","229");
        nacionalidad.put("KENIA","98");
        nacionalidad.put("KIRGUIS","256");
        nacionalidad.put("KIRIBATI","100");
        nacionalidad.put("KOREA NORTH","230");
        nacionalidad.put("KUWAIT","103");
        nacionalidad.put("LAOS","231");
        nacionalidad.put("LATVIA","113");
        nacionalidad.put("LESOTHO","110");
        nacionalidad.put("LIBANO","105");
        nacionalidad.put("LIBERIA","109");
        nacionalidad.put("LIBIA","114");
        nacionalidad.put("LIECHTENSTEI","107");
        nacionalidad.put("LITHUANIA","111");
        nacionalidad.put("LUXEMBURGO","112");
        nacionalidad.put("MACAO","121");
        nacionalidad.put("MACEDONIA-YUGOSLAVIA","208");
        nacionalidad.put("MADAGASCAR","118");
        nacionalidad.put("MADEIRA (PORTUGAL)","232");
        nacionalidad.put("MALASIA","130");
        nacionalidad.put("MALAWI","129");
        nacionalidad.put("MALI","119");
        nacionalidad.put("MALTA","126");
        nacionalidad.put("MALVINAS","128");
        nacionalidad.put("MARRUECOS","115");
        nacionalidad.put("MARSHALL ISLANDS","233");
        nacionalidad.put("MARTINICA","123");
        nacionalidad.put("MAURITANIA","124");
        nacionalidad.put("MAURITIUS","127");
        nacionalidad.put("MAYOTTE","234");
        nacionalidad.put("MEXICO","1");
        nacionalidad.put("MICRONESIA FEDERATED","235");
        nacionalidad.put("MOLDOVA","117");
        nacionalidad.put("MONACO","116");
        nacionalidad.put("MONGOLIA","236");
        nacionalidad.put("MONTENEGRO","237");
        nacionalidad.put("MONTSERRAT","125");
        nacionalidad.put("MOZAMBIQUE","131");
        nacionalidad.put("MYANMAR","120");
        nacionalidad.put("N CALEDONIA","133");
        nacionalidad.put("NAMIBIA","132");
        nacionalidad.put("NAURU","140");
        nacionalidad.put("NEPAL","139");
        nacionalidad.put("NICARAGUA","136");
        nacionalidad.put("NIGER","134");
        nacionalidad.put("NIGERIA","135");
        nacionalidad.put("NIUE","141");
        nacionalidad.put("NORFOLK ISLAND","238");
        nacionalidad.put("NORUEGA","138");
        nacionalidad.put("NUEVA ZELAND","142");
        nacionalidad.put("OMAN","143");
        nacionalidad.put("P NEW GUINEA","147");
        nacionalidad.put("PAKISTAN","149");
        nacionalidad.put("PALAU","239");
        nacionalidad.put("PALESTINIAN TERRITOR","240");
        nacionalidad.put("PANAMA","144");
        nacionalidad.put("PARAGUAY","154");
        nacionalidad.put("PERU","145");
        nacionalidad.put("PITCAIRN","241");
        nacionalidad.put("POL FRANCESA","146");
        nacionalidad.put("POLONIA","150");
        nacionalidad.put("PORTUGAL","153");
        nacionalidad.put("PUERTO RICO","152");
        nacionalidad.put("QATAR","155");
        nacionalidad.put("REP DE IRAN","91");
        nacionalidad.put("REP CENT AFR","33");
        nacionalidad.put("REP DEM KINSHASA","206");
        nacionalidad.put("REP. CHECA","46");
        nacionalidad.put("REP. DOMINIC","51");
        nacionalidad.put("REUNION","156");
        nacionalidad.put("RUMANIA","157");
        nacionalidad.put("RUSIA","158");
        nacionalidad.put("RWANDA","159");
        nacionalidad.put("SAINT HELENA","242");
        nacionalidad.put("SAINT KITTS","101");
        nacionalidad.put("SAMOA","198");
        nacionalidad.put("SAN MARINO","169");
        nacionalidad.put("SAN PEDRO Y","151");
        nacionalidad.put("SAN VICENTE","192");
        nacionalidad.put("SANTA LUCIA","106");
        nacionalidad.put("SAO TOME AND","173");
        nacionalidad.put("SENEGAL","170");
        nacionalidad.put("SERBIA","243");
        nacionalidad.put("SEYCHELLES","162");
        nacionalidad.put("SIERRA LEONA","168");
        nacionalidad.put("SINGAPUR","165");
        nacionalidad.put("SLOVAKIA","167");
        nacionalidad.put("SLOVENIA","166");
        nacionalidad.put("SOMALIA","171");
        nacionalidad.put("SRI LANKA","108");
        nacionalidad.put("SUDAFRICA","201");
        nacionalidad.put("SUDAN","163");
        nacionalidad.put("SUECIA","164");
        nacionalidad.put("SUIZA","35");
        nacionalidad.put("SURINAM","172");
        nacionalidad.put("SVALBARD &amp; JAN MAYEN","244");
        nacionalidad.put("SWAZILAND","176");
        nacionalidad.put("SYRIAN ARAB","175");
        nacionalidad.put("TAHITI","177");
        nacionalidad.put("TAILANDIA","180");
        nacionalidad.put("TAIWAN","186");
        nacionalidad.put("TAJIKISTAN","245");
        nacionalidad.put("TANZANIA","187");
        nacionalidad.put("TIMOR-LESTE","246");
        nacionalidad.put("TOGO","179");
        nacionalidad.put("TOKELAU","247");
        nacionalidad.put("TONGA","182");
        nacionalidad.put("TRINI TOBAGO","184");
        nacionalidad.put("TUNEZ","181");
        nacionalidad.put("TURKISH REP OF CYPRU","248");
        nacionalidad.put("TURKMENISTAN","249");
        nacionalidad.put("TURKS CAICOS","178");
        nacionalidad.put("TURQUIA","183");
        nacionalidad.put("TUVALU","185");
        nacionalidad.put("UGANDA","189");
        nacionalidad.put("UKRANIA","188");
        nacionalidad.put("URUGUAY","190");
        nacionalidad.put("US MINOR OUTLYING IS","250");
        nacionalidad.put("UZBEKISTAN","251");
        nacionalidad.put("VANUATU","197");
        nacionalidad.put("VENEZUELA","193");
        nacionalidad.put("VIETNAM","196");
        nacionalidad.put("VIETNAM","252");
        nacionalidad.put("WALLIS AND FUTUNA","253");
        nacionalidad.put("WESTERN SAHARA","254");
        nacionalidad.put("YEMEN","199");
        nacionalidad.put("YUGOSLAVIA","200");
        nacionalidad.put("ZAIRE","204");
        nacionalidad.put("ZAMBIA","203");
        nacionalidad.put("ZIMBABWE","205");


        getcatalogos.put("genero",genero );
        getcatalogos.put("nacionalidad", nacionalidad);
        getcatalogos.put("tipo_vivienda",tipo_vivienda );
        getcatalogos.put("giro_empresa",giro_empresa );
        getcatalogos.put("profesion",profesion );
        getcatalogos.put("comercio",comercio );
        getcatalogos.put("banco",banco );
        log.info("termina cargaCatalogos estaticos");
        
		
   }


}
