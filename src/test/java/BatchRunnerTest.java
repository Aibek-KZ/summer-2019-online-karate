import com.intuit.karate.junit5.Karate;

class BatchRunnerTest {
    
    // this will run all *.feature files that exist in sub-directories
    // see https://github.com/intuit/karate#naming-conventions
    // https://github.com/CybertekSchool/summer-2019-online-karate github Cybertek

    @Karate.Test
    Karate testUsers() {
        return new Karate().tags("ombd").relativeTo(getClass());
    }

    @Karate.Test
    Karate bookitTests(){
        return new Karate().tags("bookit").relativeTo(getClass());
    }

    @Karate.Test
    Karate scenarioOutline(){
        return new Karate().tags("scenario_outline_bookit").relativeTo(getClass());
    }

    @Karate.Test
    Karate metaWeatherTests(){
        return new Karate().tags("meta_weather").relativeTo(getClass());
    }

    @Karate.Test
    Karate spartanTets(){
        return new Karate().tags("spartan").relativeTo(getClass());
    }

    @Karate.Test
    Karate deleteSpartan(){
        return new Karate().tags("delete_spartan").relativeTo(getClass());
    }

    @Karate.Test
    Karate AddSpartanFromJSON(){
        return new Karate().tags("add_spartan_with_external_json").relativeTo(getClass());
    }

    @Karate.Test
    Karate PatchSpartanFromJSON(){
        return new Karate().tags("patch_spartan").relativeTo(getClass());
    }

    @Karate.Test
    Karate updateSpartanFromJSON(){
        return new Karate().tags("update_spartan").relativeTo(getClass());
    }


    
}
