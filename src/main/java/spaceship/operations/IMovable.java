package spaceship.operations;

import java.util.Vector;

public interface IMovable {
    Vector getPosition();
    void setPosition(Vector newValue);
    Vector getVelocity();
}
