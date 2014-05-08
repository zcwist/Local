package self.kiwi.model;


public class TextItem extends GeneralItem {
	protected String textContent;

	public TextItem(float longitue, float latitude, String textContext) {
		super(longitue, latitude);
		// TODO Auto-generated constructor stub
		this.textContent = textContext;
		itemObj.append("textContent", textContent);
	}


}
