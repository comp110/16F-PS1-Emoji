package comp110;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class FaceShape {

  // Instance Variable
  private Color _tone;

  // Constructor
  public FaceShape(Color tone) {
    _tone = tone;
  }

  // Methods

  public Group shapes(double x, double y) {
    // Declare a local variable and initialize it to a new Group instance.
    Group aGroup = new Group();

    // TODO: Draw your FaceShape by adding one or more shapes to aGroup.
    //  * Requirement: One shape in aGroup must have its fill property
    //                 set to the _tone instance variable.

    // Here is where we move the entire group of shapes based on the
    // x and y parameters provided to us.
    aGroup.setTranslateX(x);
    aGroup.setTranslateY(y);

    // Finally we return the group to the caller of this method.
    return aGroup;
  }

  // Getter Method
  public Color getTone() {
    return _tone;
  }

  // Setter Method
  public void setTone(Color tone) {
    _tone = tone;
  }

}