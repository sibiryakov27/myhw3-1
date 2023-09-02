public class BonusMilesService {
    public int calculate(int price) {
        int rublesForOneMile = 20;
        int bonus = price / rublesForOneMile;
        return bonus;
    }
}
