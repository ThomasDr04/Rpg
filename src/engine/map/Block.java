package engine.map;

import java.awt.Image;

public class Block {
    private int row;
    private int column;
    private int positionX;
    private int positionY;
    private Image image;
    
    public Block(int row, int col, int positionX, int positionY) {
        this.row = row;
        this.column = col;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
    public void setRow(int row) {
    	this.row=row;
    }
    public void setColumn(int column) {
    	this.column=column;
    }

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
    
    
}