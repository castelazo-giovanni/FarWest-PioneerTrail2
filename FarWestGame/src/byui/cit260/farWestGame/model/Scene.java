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
    Navoo("Nauvoo", "Description of Navoo TBD", 1), 
    SugarCreek("Sugar Creek", "Description of Sugar Creek TBD", 0),
    RichardsonsPoint("Richardson's Point", "Description of Richardson's Point TBD", 0),
    CharitonRiverCrossing("Chariton River Crossing", "Description of CRC TBD", 3),
    LocustCreek("Locust Creek", "Description of LC TBD", 2),
    GardenGrove("GardenGrove", "Description of Garden Grove TBD", 0),
    NishnabotnaRiver("Nishnabotna River", "Description TBD", 0),
    GrandEncampment("Grand Encampment", "Description TBD", 0),
    CouncilBluffs("Council Bluffs", "Description TBD", 0),
    WinterQuarters("Winter Quarters", "Description TBD", 0),
    ElkhornRiverCrossing("Elkhorn River Crossing", "Description TBD", 0),
    PlatteRiver("PlatteRiver", "Description TBD", 0),
    FortKearny("Fort Kearny", "Description TBD", 0),
    ConfluencePoint("Confluence Point", "Description TBD", 0),
    AshHollow("Ash Hollo", "Description TBD", 0),
    ChimneyRock("Chimney Rock", "Description TBD", 0),
    ScottsBluff("Scott's Bluff", "Description TBD", 0),
    FortLaramie("Fort Laramie", "Description TBD", 0),
    SweetwaterRiver("Sweetwater River", "Description TBD", 0),
    IndependenceRock("Independence Rock", "Description TBD", 0),
    FortBridger("Fort Bridger", "Description TBD", 0),
    EchoCanyon("Echo Canyon", "Description TBD", 0),
    GoldenPassRoad("Golden Pass Road", "Description TBD", 0),
    EmigrationCanyon("Emigration Canyon", "Description TBD", 0),
    Zion("Zion", "Description TBD", 0);

    private String sceneName;
    private String sceneDescription;
    private Integer sceneIllness;

    Scene(String sceneName, String sceneDescription, Integer sceneIllness){
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

    public Integer getSceneIllness() {
        return sceneIllness;
    }

    
    

    @Override
    public String toString() {
        return "Scene{" + "sceneName=" + sceneName + ", sceneDescription=" + sceneDescription + ", sceneIllness=" + sceneIllness + '}';
    }
}
