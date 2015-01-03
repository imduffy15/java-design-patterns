package ie.ianduffy.iterator;

import java.util.List;

public class TreasureChestItemIterator implements ItemIterator {

	private int idx;

	private final TreasureChest treasureChest;

	private final ItemType type;

	public TreasureChestItemIterator(TreasureChest treasureChest, ItemType type) {
		this.treasureChest = treasureChest;
		this.type = type;
		this.idx = -1;
	}

	private int findNextIdx() {
		List<Item> items = treasureChest.getItems();
		int tempIdx = idx;
		while (true) {
			tempIdx++;
			if (tempIdx >= items.size()) {
				tempIdx = -1;
				break;
			}
			if (type.equals(ItemType.ANY) || items.get(tempIdx).getType().equals(type)) {
				break;
			}
		}
		return tempIdx;
	}

	@Override
	public boolean hasNext() {
		return findNextIdx() != -1;
	}

	@Override
	public Item next() {
		idx = findNextIdx();
		if (idx != -1) {
			return treasureChest.getItems().get(idx);
		}
		return null;
	}
}
