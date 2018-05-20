/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.model;

/**
 *
 * @author Giovanni
 */
public enum Scene {
    Navoo("Nauvoo", "A swampy area along the Mississippi River.  It is one of the largest cities in Illinois, and an important commercial center on the upper Mississippi.", "Fever"), 
    SugarCreek("Sugar Creek", "This is a major campsite in Iowa, about seven miles inland from the Mississippi River.  Bone-chilling cold, wind, snow, and ice in the winter make this a treacherous area.", "Hypothermia"),
    RichardsonsPoint("Richardson's Point", "This area is known for heavy rains which make travel difficult.  It is located 35 miles from Nauvoo.", "Hypothermia"),
    CharitonRiverCrossing("Chariton River Crossing", "The worst weather of the trail an be found here.  Plenty of trees, but no grass for the animals. It is located 80 miles from Nauvoo.", "Fever"),
    LocustCreek("Locust Creek", "Place of hope.  Located 103 miles from Nauvoo.", "None"),
    GardenGrove("GardenGrove", "A substantial camp were cabins are erected, grounds are fenced and plowed, crops are planted. Individuals remain and oversee the camp.", "None"),
    NishnabotnaRiver("Nishnabotna River", "Marks the meeting place of  two refugee peoples, the Latter-day Saints and the Potawatomi Indians. ", "None"),
    GrandEncampment("Grand Encampment", "Broad open area ideal for stopping and getting rest.  Located near the Missouri River.", "None"),
    CouncilBluffs("Council Bluffs", "Major outfitting point for people heading west.  Located at the banks of the Missouri River.  Many will leave to serve the Army ", "None"),
    WinterQuarters("Winter Quarters", "Located across the river from Council Bluffs.  An instant city on the plains which has a large stockade and about 700 homes ranging from solid, two-story structures to simple dugouts in the bluffs.", "Hypothermia"),
    ElkhornRiverCrossing("Elkhorn River Crossing", "Major river crossing where many needed to walk across the cold river.", "Fever"),
    PlatteRiver("PlatteRiver", "Plenty of feed and stock along the river. ", "Snake bite"),
    FortKearny("Fort Kearny", "Known for terrible thunderstorms which caused deaths.  Rought terrain in the area", "None"),
    ConfluencePoint("Confluence Point", "Plenty of vegetation and a water source", "None"),
    AshHollow("Ash Hollow", "No clean source of water.  ", "None"),
    ChimneyRock("Chimney Rock", "Chimney Rock is a finger of Brulé clay jutting nearly 500 feet into the western Nebraska sky.  Great place to rest for a while", "None"),
    ScottsBluff("Scott's Bluff", "Has many grand formations of nature. In some places, we rolled off large rocks of near a ton’s weight that would go thundering down the mountain and into the vale beneath.  Careful when navigating your wagon through here.", "Broken bone"),
    FortLaramie("Fort Laramie", "Established dwellings.  ", "None"),
    SweetwaterRiver("Sweetwater River", "A high, dry, and difficult 50-mile overland journey. Plenty of game and resources. ", "None"),
    IndependenceRock("Independence Rock", "Large rock formation near a water source.", "None"),
    FortBridger("Fort Bridger", "Located 1183 miles from starting point", "Fever"),
    EchoCanyon("Echo Canyon", "High rock walls and narrow profile made it a veritable, and frequently noted, echo chamber.", "Broken Bone"),
    GoldenPassRoad("Golden Pass Road", "Easy road to travel.  Highly traveled by gold miners on their way to California", "None"),
    EmigrationCanyon("Emigration Canyon", "Filled with chocking river willows and scrub oaks.", "None"),
    Zion("Zion", "The first glimpse of this broad, open valley after such hardship provides a deeply emotional moment.", "None");

    private String sceneName;
    private String sceneDescription;
    private String sceneIllness;

    Scene(String sceneName, String sceneDescription, String sceneIllness){
        this.sceneName = sceneName;
        this.sceneDescription = sceneDescription;
        this.sceneIllness = sceneIllness;
    }

    public String getSceneName() {
        return sceneName;
    }

    public String getSceneDescription() {
        return sceneDescription;
    }

    public String getSceneIllness() {
        return sceneIllness;
    }

    
    

    @Override
    public String toString() {
        return "Scene{" + "sceneName=" + sceneName + ", sceneDescription=" + sceneDescription + ", sceneIllness=" + sceneIllness + '}';
    }
}
