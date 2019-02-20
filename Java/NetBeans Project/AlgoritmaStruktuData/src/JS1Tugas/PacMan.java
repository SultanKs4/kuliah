package JS1Tugas;

/**
 *
 * @author Sultan
 */
public class PacMan {
    public int x, y, width, height;

    public void moveLeft() {
        x -= 1;
    }

    public void moveRight() {
        x += 1;
    }

    public void moveUp() {
        y += 1;
    }

    public void moveDown() {
        y -= 1;
    }

    public void printPosition() {
        System.out.println("Posisi X : " + x + ", Posisi Y : " + y);
    }
}
