package entity;
//枚举法
public enum ShapeTypeEnum {
	CIRCLE("entity.Circle"),
    SQUARE("entity.Square"),
    RECTANGLE("entity.Rectangle");
    private String className;
    ShapeTypeEnum(String className) {//构造方法
        this.className = className;
    }
    public String getClassName() {
        return className;
    }
    
}
