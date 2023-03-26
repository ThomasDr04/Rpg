package config;


public class GameConfiguration {

// block configuration	
    public static final int ORIGINAL_BLOCK = 16; // block of 16*16 pixels (the original size of most of the 2d games for our tiles)
    public static final int SCALE = 3; // to render the block greater in our game
    public static final int BLOCK_SIZE = ORIGINAL_BLOCK * SCALE; // rendering the block greater our game 

//map & screen configuration
    public static final int COLUMN_COUNT = 32; // the number of block in a column (width)
    public static final int ROW_COUNT = 16; // the number of block in a row (height)

    public static final int WINDOW_WIDTH = BLOCK_SIZE * COLUMN_COUNT;  // a window of COLUMN_COUNT block's width 
    public static final int WINDOW_HEIGHT = BLOCK_SIZE * ROW_COUNT; // a window of ROW_COUNT block's height 
    
// speed
    public static final int PLAYER_SPEED = 8;
    public static final int FPS = 30;


}
