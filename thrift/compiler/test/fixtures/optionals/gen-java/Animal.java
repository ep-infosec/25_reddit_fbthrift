/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import com.facebook.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({ "unused" })
public class Animal {
  public static final int DOG = 1;
  public static final int CAT = 2;
  public static final int TARANTULA = 3;

  public static final IntRangeSet VALID_VALUES = new IntRangeSet(
    DOG, 
    CAT, 
    TARANTULA );

  @SuppressWarnings("serial")
public static final Map<Integer, String> VALUES_TO_NAMES = new HashMap<Integer, String>() {{
    put(DOG, "DOG");
    put(CAT, "CAT");
    put(TARANTULA, "TARANTULA");
  }};
}
