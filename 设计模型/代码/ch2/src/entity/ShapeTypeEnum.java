package entity;
//ö�ٷ�
public enum ShapeTypeEnum {
	CIRCLE("entity.Circle"),
    SQUARE("entity.Square"),
    RECTANGLE("entity.Rectangle");
    private String className;
    ShapeTypeEnum(String className) {//���췽��
        this.className = className;
    }
    public String getClassName() {
        return className;
    }
    
}
