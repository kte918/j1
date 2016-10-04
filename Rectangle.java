class Rectangle {
private int width;
private int height;

public Rectangle (int w,int h) {
this.width = w;
this.height = h;
}

public int getWidth () {
return width;
}

public int getHeight() {
return height;
}

public int CalcAreaRectangle() {
return width * height;
}
}

Rectangle r = new Rectangle(5,2);

r.getWidth();
r.getHeigth();
r.CalcAreaRectangle();