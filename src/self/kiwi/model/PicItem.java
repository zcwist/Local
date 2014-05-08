package self.kiwi.model;

public class PicItem extends GeneralItem {
	String picURL;

	public PicItem(float longitude, float latitude, String picURL) {
		super(longitude, latitude);
		// TODO Auto-generated constructor stub
		this.picURL = picURL;
		itemObj.append("picURL", picURL);
	}

}
