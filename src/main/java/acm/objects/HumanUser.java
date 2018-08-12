package acm.objects;

public class HumanUser extends AbstractUser{

	@Override
	public boolean postAPost(AbstractPost Post) {
		return false;
	}

}
