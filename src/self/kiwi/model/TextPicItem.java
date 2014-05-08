package self.kiwi.model;

public class TextPicItem extends TextItem {
	String picURL;

	public TextPicItem(float longitue, float latitude, String textContext, String picURL) {
		super(longitue, latitude, textContext);
		// TODO Auto-generated constructor stub
		this.picURL = picURL;
		itemObj.append("picURL", picURL);
	}

}
