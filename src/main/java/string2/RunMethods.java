package string2;

public class RunMethods {

    public static void main(String[] args) {
        StringMethods stringMethods = new StringMethods();

        System.out.println("\ndoubleChar\n");
        System.out.println(stringMethods.doubleChar("The"));
        System.out.println(stringMethods.doubleChar("AAbb"));
        System.out.println(stringMethods.doubleChar("Hi-There"));

        System.out.println("\ncountCode\n");
        System.out.println(stringMethods.countCode("aaacodebbb"));
        System.out.println(stringMethods.countCode("codexxcode"));
        System.out.println(stringMethods.countCode("cozexxcope"));

        System.out.println("\nbobThere\n");
        System.out.println(stringMethods.bobThere("abcbob"));
        System.out.println(stringMethods.bobThere("b9b"));
        System.out.println(stringMethods.bobThere("bac"));

        System.out.println("\nrepeatEnd\n");
        System.out.println(stringMethods.repeatEnd("Hello", 3));
        System.out.println(stringMethods.repeatEnd("Hello", 2));
        System.out.println(stringMethods.repeatEnd("Hello", 1));

        System.out.println("\nprefixAgain\n");
        System.out.println(stringMethods.prefixAgain("abXYabc", 1));
        System.out.println(stringMethods.prefixAgain("abXYabc", 2));
        System.out.println(stringMethods.prefixAgain("abXYabc", 3));

        System.out.println("\nsameStarChar\n");
        System.out.println(stringMethods.sameStarChar("xy*yzz"));
        System.out.println(stringMethods.sameStarChar("xy*zzz"));
        System.out.println(stringMethods.sameStarChar("*xa*az"));

        System.out.println("\nstarOut\n");
        System.out.println(stringMethods.starOut("ab*cd"));
        System.out.println(stringMethods.starOut("ab**cd"));
        System.out.println(stringMethods.starOut("sm*eilly"));

        System.out.println("\ncountHi\n");
        System.out.println(stringMethods.countHi("abc hi ho"));
        System.out.println(stringMethods.countHi("ABChi hi"));
        System.out.println(stringMethods.countHi("hihi"));

        System.out.println("\nendOther\n");
        System.out.println(stringMethods.endOther("Hiabc", "abc"));
        System.out.println(stringMethods.endOther("AbC", "HiaBc"));
        System.out.println(stringMethods.endOther("abc", "abXabc"));

        System.out.println("\nxyBalance\n");
        System.out.println(stringMethods.xyBalance("aaxbby"));
        System.out.println(stringMethods.xyBalance("aaxbb"));
        System.out.println(stringMethods.xyBalance("yaaxbb"));

        System.out.println("\nrepeatFront\n");
        System.out.println(stringMethods.repeatFront("Chocolate", 4));
        System.out.println(stringMethods.repeatFront("Chocolate", 3));
        System.out.println(stringMethods.repeatFront("Ice Cream", 2));

        System.out.println("\nxyzMiddle\n");
        System.out.println(stringMethods.xyzMiddle("AAxyzBB"));
        System.out.println(stringMethods.xyzMiddle("AxyzBB"));
        System.out.println(stringMethods.xyzMiddle("AxyzBBB"));

        System.out.println("\noneTwo\n");
        System.out.println(stringMethods.oneTwo("abc"));
        System.out.println(stringMethods.oneTwo("tca"));
        System.out.println(stringMethods.oneTwo("tcagdo"));

        System.out.println("\nplusOut\n");
        System.out.println(stringMethods.plusOut("12xy34", "xy"));
        System.out.println(stringMethods.plusOut("12xy34", "1"));
        System.out.println(stringMethods.plusOut("12xy34xyabcxy", "xy"));

        System.out.println("\ncatDog\n");
        System.out.println(stringMethods.catDog("catdog"));
        System.out.println(stringMethods.catDog("catcat"));
        System.out.println(stringMethods.catDog("1cat1cadodog"));

        System.out.println("\nxyzThere\n");
        System.out.println(stringMethods.xyzThere("abcxyz"));
        System.out.println(stringMethods.xyzThere("abc.xyz"));
        System.out.println(stringMethods.xyzThere("xyz.abc"));

        System.out.println("\nmixString\n");
        System.out.println(stringMethods.mixString("abc", "xyz"));
        System.out.println(stringMethods.mixString("Hi", "There"));
        System.out.println(stringMethods.mixString("xxxx", "There"));

        System.out.println("\nrepeatSeparator\n");
        System.out.println(stringMethods.repeatSeparator("Word", "X", 3));
        System.out.println(stringMethods.repeatSeparator("This", "And", 2));
        System.out.println(stringMethods.repeatSeparator("This", "And", 1));

        System.out.println("\ngetSandwich\n");
        System.out.println(stringMethods.getSandwich("breadjambread"));
        System.out.println(stringMethods.getSandwich("xxbreadjambreadyy"));
        System.out.println(stringMethods.getSandwich("xxbreadyy"));

        System.out.println("\nzipZap\n");
        System.out.println(stringMethods.zipZap("zipXzap"));
        System.out.println(stringMethods.zipZap("zopzop"));
        System.out.println(stringMethods.zipZap("zzzopzop"));

        System.out.println("\nwordEnds\n");
        System.out.println(stringMethods.wordEnds("abcXY123XYijk", "XY"));
        System.out.println(stringMethods.wordEnds("XY123XY", "XY"));
        System.out.println(stringMethods.wordEnds("XY1XY", "XY"));

    }
}
