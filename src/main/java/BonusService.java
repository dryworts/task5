public class BonusService {
    public long calculate(long amount, boolean registered) {
        //naming
        int Percent = registered ? 3 : 1;
        long bonus = amount * Percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
