package engine.process;


public class GameBuilder {
   
	
	public static Map buildMap(String mapName) {
		return new Map(mapName);
	}
	
	public static MobileElementManager buildInitMobile() {
		MobileElementManager manager = new MobileElementManager();
		
//		initializePlayerStats(manager);
		
		return manager;
		}
		
	
}