package acm.objects;

public class SimpleStatusUpdate extends AbstractPost{

	@Override
	public boolean uploadToDatabase() {
		return false;
	}

}
