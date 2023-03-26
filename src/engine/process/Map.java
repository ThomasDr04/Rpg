package engine.process;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import config.GameConfiguration;
import engine.map.Block;

public class Map {
	private Block[][] blocks;
	
	private int rowCount = GameConfiguration.ROW_COUNT;
	private int columnCount = GameConfiguration.COLUMN_COUNT;
	
	private Image image[] = new Image[100];
	
	private String mapName;
	
	public Map(String mapName) {
		this.mapName = mapName;
		
		blocks = new Block[rowCount][columnCount];
		getBlockImage();
		GetBlockPosition();
		blockImageAttribution();
				
	}
	
	public void GetBlockPosition() {
		
		int positionX = 0;
		int positionY = 0;
		
		for(int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
			for(int columnIndex = 0; columnIndex < columnCount; columnIndex++){
				blocks[rowIndex][columnIndex] = new Block(rowIndex, columnIndex, positionX, positionY);
				positionX += GameConfiguration.BLOCK_SIZE;
			}
			positionX = 0;
			positionY += GameConfiguration.BLOCK_SIZE; 
			
		}
	}
	
	public void blockImageAttribution() {
		
		try {
		InputStream is = getClass().getResourceAsStream("/maps/map1.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
			for(int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
				String line = br.readLine();
				for(int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
					String numbers[] = line.split(" ");
					int num = Integer.parseInt(numbers[columnIndex]);
					blocks[rowIndex][columnIndex].setImage(image[num]);
				}
			}
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
	}
	
	public void getBlockImage() {
		image[99]= Utility.readImage("images/map/.png");		
		//sol de base
		image[0]= Utility.readImage("images/map/floor_3.png");
		//corner
		image[1]=Utility.readImage("images/map/wall_corner_left.png");
		image[2]=Utility.readImage("images/map/wall_corner_right.png");
		image[3]=Utility.readImage("images/map/wall_corner_front_left.png");
		image[4]=Utility.readImage("images/map/wall_corner_front_right.png");
		image[5]=Utility.readImage("images/map/wall_corner_top_left.png");
		image[6]=Utility.readImage("images/map/wall_corner_top_right.png");
		image[7]=Utility.readImage("images/map/wall_hole_1.png");
		image[8]=Utility.readImage("images/map/wall_hole_2.png");
		//fountain
		image[9]=Utility.readImage("images/map/wall_fountain_top.png");
		image[10]=Utility.readImage("images/map/wall_fountain_mid_red_anim_f0.png");
		image[11]=Utility.readImage("images/map/wall_fountain_basin_red_anim_f0.png");		

		image[12]=Utility.readImage("images/map/wall_fountain_mid_blue_anim_f0.png");
		image[13]=Utility.readImage("images/map/wall_fountain_basin_blue_anim_f0.png");	
		
		image[14]=Utility.readImage("images/map/wall_goo.png");
		image[15]=Utility.readImage("images/map/wall_goo_base.png");		
		
		//coffre
		image[16]=Utility.readImage("images/map/chest_empty_open_anim_f0.png");
		//column
		image[17]=Utility.readImage("images/map/column_mid.png");
		image[18]=Utility.readImage("images/map/column_top.png");
		image[19]=Utility.readImage("images/map/column_base.png");
		image[20]=Utility.readImage("images/map/wall_column_top.png");
		image[21]=Utility.readImage("images/map/wall_column_mid.png");
		//doors
		image[22]=Utility.readImage("images/map/crate.png");
		
		image[23]=Utility.readImage("images/map/doors_frame_left.png");
		image[24]=Utility.readImage("images/map/doors_frame_right.png");
		image[25]=Utility.readImage("images/map/doors_frame_top.png");
		image[26]=Utility.readImage("images/map/doors_leaf_closed.png");
		image[27]=Utility.readImage("images/map/doors_leaf_open.png");
		//
		image[28]=Utility.readImage("images/map/edge.png");
		//type de sol
		image[29]=Utility.readImage("images/map/floor_1.png");
		image[30]=Utility.readImage("images/map/floor_2.png");
		image[31]=Utility.readImage("images/map/floor_4.png");
		image[32]=Utility.readImage("images/map/floor_5.png");
		image[33]=Utility.readImage("images/map/floor_6.png");
		image[34]=Utility.readImage("images/map/floor_7.png");
		image[35]=Utility.readImage("images/map/floor_8.png");

		image[36]=Utility.readImage("images/map/floor_ladder.png");
		image[37]=Utility.readImage("images/map/floor_spikes_anim_f0.png");
		image[38]=Utility.readImage("images/map/hole.png");
		//banner
		image[39]=Utility.readImage("images/map/wall_banner_blue.png");	
		image[40]=Utility.readImage("images/map/wall_banner_green.png");	
		image[41]=Utility.readImage("images/map/wall_banner_red.png");	
		image[42]=Utility.readImage("images/map/wall_banner_yellow.png");

		image[43]=Utility.readImage("images/map/wall_banner_blue.png");	
		image[44]=Utility.readImage("images/map/wall_banner_green.png");	
		image[45]=Utility.readImage("images/map/wall_banner_red.png");	
		image[46]=Utility.readImage("images/map/wall_banner_yellow.png");




	
	
	
	
	}

	public Block[][] getBlocks() {
		return blocks;
	}

	public void setBlocks(Block[][] blocks) {
		this.blocks = blocks;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getColumnCount() {
		return columnCount;
	}

	public void setColumnCount(int columnCount) {
		this.columnCount = columnCount;
	}

	public Image[] getImage() {
		return image;
	}

	public void setImage(Image[] image) {
		this.image = image;
	}

	public String getMapName() {
		return mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}
	
	
}
