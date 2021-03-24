public class Plane implements Transport{
    @Override
    public void accept(Remonter remonter) {
        remonter.fix(this);
    }
}
