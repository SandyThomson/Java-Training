package vehicle;

// Why not VehicleInterface??? WHy Java book, WHY?
public interface IVehicle {

	default int range() {
		return getMpg() * getFuelCap();
	}

	default double fuelNeeded(int miles) {
		return miles / getMpg();
	}

	public int getFuelCap();

	public int getMpg();

	public int getPassengers();

	public void setFuelCap(int fuelCap);

	public void setMpg(int mpg);

	public void setPassengers(int p);
}
