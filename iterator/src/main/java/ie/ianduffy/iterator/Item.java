package ie.ianduffy.iterator;

class Item {

	private final String name;

	private ItemType type;

	public Item(ItemType type, String name) {
		this.setType(type);
		this.name = name;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return name;
	}


}
