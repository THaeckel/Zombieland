package controller;

/**
 * Contrains spezial thing for the travelmap
 * @author Mikko Eberhardt
 *
 */
public class TravelMap {
	
	/**
	 * Array wich contains the ids for the Maptiles
	 */
	public int travelMap[][]=new int [20][20];
	
	/**
	 * Contsruktor
	 */
	public TravelMap(){
		createMap();
	}

	/**
	 * this methode fill the array with ids
	 */
	private void createMap() {
		boolean changeRows = true;
		for(int y=0; y<20;y++){
			for(int x=0; x<20; x++){
				if(changeRows){
					travelMap[x][y] = 1;
					changeRows = false;
				} else{
					travelMap[x][y] = 2;
					changeRows = true;
				}
			}
		}
	}
	
	/**
	 * getter for the map
	 */
	public int getTravelMap(int x, int y){
		return travelMap[x][y];
	}

}
