import java.util.*;

public class TelcoAllowance implements UsagePromo {

    private static final Map<String, Double> telcoPromoHashmap = new HashMap<>();

    static{
        telcoPromoHashmap.put("Smart", 15.0);
        telcoPromoHashmap.put("Globe", 10.0);
        telcoPromoHashmap.put("Ditto", 8.0);
    }
    @Override
    public String showAllowance(String telcoName, double money) {
        return telcoPromoHashmap.get(telcoName) + "GB " + money + "PHP";
    }
}
