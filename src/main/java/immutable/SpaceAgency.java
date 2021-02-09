package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {
    private List<Satellite> regDatabase = new ArrayList<>();
    public void registerSatellite(Satellite satellite) {
        if (satellite == null) {
            throw new NullPointerException("Parameter must not be null!");
        }
        regDatabase.add(satellite);
    }
    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        for (Satellite s : regDatabase) {
            if (s.getRegisterIdent().equals(registerIdent)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Satellite with the given registration cannot be found!" +registerIdent);
    }

    @Override
    public String toString() {
        return regDatabase.toString();
    }
}
