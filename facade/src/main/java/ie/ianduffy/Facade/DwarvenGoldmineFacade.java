package ie.ianduffy.Facade;

import java.util.ArrayList;
import java.util.List;

class DwarvenGoldmineFacade {

	private final List<DwarvenMineWorker> workers;

	public DwarvenGoldmineFacade() {
		workers = new ArrayList<>();
		workers.add(new DwarnvenGoldDigger());
		workers.add(new DwarnvenCartOperator());
		workers.add(new DwarnvenTunnelDigger());
	}

	public void digOutGold() {
		for (DwarvenMineWorker worker : workers) {
			worker.work();
		}
	}

	public void endDay() {
		for (DwarvenMineWorker worker : workers) {
			worker.goHome();
			worker.goToSleep();
		}
	}

	public void startNewDay() {
		for (DwarvenMineWorker worker : workers) {
			worker.wakeUp();
			worker.goToMine();
		}
	}
}
