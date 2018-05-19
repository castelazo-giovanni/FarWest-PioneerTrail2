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
    Navoo("Nauvoo", "Description of Navoo TBD", "Fever"), 
    SugarCreek("Sugar Creek", "Description of Sugar Creek TBD", "Hypothermia"),
    RichardsonsPoint("Richardson's Point", "Description of Richardson's Point TBD", "Snake Bite"),
    CharitonRiverCrossing("Chariton River Crossing", "Description of CRC TBD", "Broken Bone"),
    LocustCreek("Locust Creek", "Description of LC TBD", "None"),
    GardenGrove("GardenGrove", "Description of Garden Grove TBD", "None"),
    NishnabotnaRiver("Nishnabotna River", "Description TBD", "Snake Bite"),
    GrandEncampment("Grand Encampment", "Description TBD", "Hypothermia"),
    CouncilBluffs("Council Bluffs", "Description TBD", "Fever"),
    WinterQuarters("Winter Quarters", "Description TBD", "None"),
    ElkhornRiverCrossing("Elkhorn River Crossing", "Description TBD", "None"),
    PlatteRiver("PlatteRiver", "Description TBD", "Hypothermia"),
    FortKearny("Fort Kearny", "Description TBD", "None"),
    ConfluencePoint("Confluence Point", "Description TBD", "Broken Bone"),
    AshHollow("Ash Hollo", "Description TBD", "None"),
    ChimneyRock("Chimney Rock", "Description TBD", "None"),
    ScottsBluff("Scott's Bluff", "Description TBD", "None"),
    FortLaramie("Fort Laramie", "Description TBD", "Snake Bite"),
    SweetwaterRiver("Sweetwater River", "Description TBD", "None"),
    IndependenceRock("Independence Rock", "Description TBD", "Broken Bone"),
    FortBridger("Fort Bridger", "Description TBD", "None"),
    EchoCanyon("Echo Canyon", "Description TBD", "Broken Bone"),
    GoldenPassRoad("Golden Pass Road", "Description TBD", "None"),
    EmigrationCanyon("Emigration Canyon", "Description TBD", "None"),
    Zion("Zion", "Description TBD", "None");

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
