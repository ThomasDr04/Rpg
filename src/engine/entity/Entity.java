package engine.entity;


    public abstract class Entity {
	private int positionX, positionY;
	private int SpriteNumber;
	private String direction;
	
	public Entity(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
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

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getSpriteNumber() {
		return SpriteNumber;
	}

	public void setSpriteNumber(int spriteNumber) {
		SpriteNumber = spriteNumber;
	}
	
}

