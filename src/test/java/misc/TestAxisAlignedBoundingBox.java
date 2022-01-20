package misc;

import com.jme3.math.Vector3f;
import math.MathHelper;
import org.junit.jupiter.api.Test;

import static base.JmeAssertions.assertVecEquals;

public class TestAxisAlignedBoundingBox {
  @Test
  public void testGetCenter() {
    AxisAlignedBoundingBox aabb = new AxisAlignedBoundingBox();
    aabb.add(new Vector3f(0, 0, 0));
    aabb.add(new Vector3f(1, 1, 1));
    assertVecEquals(new Vector3f(0.5f, 0.5f, 0.5f), aabb.getCenter(), MathHelper.TOLERANCE);
  }
}
