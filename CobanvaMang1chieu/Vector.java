public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector add(Vector other) {
        double newX = this.x + other.x;
        double newY = this.y + other.y;
        double newZ = this.z + other.z;
        return new Vector(newX, newY, newZ);
    }
    public Vector subtract(Vector other) {
        double newX = this.x - other.x;
        double newY = this.y - other.y;
        double newZ = this.z - other.z;
        return new Vector(newX, newY, newZ);
    }
    public Vector multiply(double scalar) {
        double newX = this.x * scalar;
        double newY = this.y * scalar;
        double newZ = this.z * scalar;
        return new Vector(newX, newY, newZ);
    }
    public double dotProduct(Vector other) {
        double productX = this.x * other.x;
        double productY = this.y * other.y;
        double productZ = this.z * other.z;
        return productX + productY + productZ;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3);
        Vector vector2 = new Vector(4, 5, 6);

        Vector sum = vector1.add(vector2);
        Vector difference = vector1.subtract(vector2);
        Vector scaledVector = vector1.multiply(2);
        double dotProduct = vector1.dotProduct(vector2);

        System.out.println("Sum: " + sum.getX() + ", " + sum.getY() + ", " + sum.getZ());
        System.out.println("Difference: " + difference.getX() + ", " + difference.getY() + ", " + difference.getZ());
        System.out.println("Scaled Vector: " + scaledVector.getX() + ", " + scaledVector.getY() + ", " + scaledVector.getZ());
        System.out.println("Dot Product: " + dotProduct);
    }
}