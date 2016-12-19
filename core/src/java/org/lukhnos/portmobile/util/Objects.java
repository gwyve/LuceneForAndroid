package org.lukhnos.portmobile.util;

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.Arrays;

public class Objects {
  public static <T> T requireNonNull(T obj) {
    if (obj == null) {
      throw new NullPointerException();
    }
    return obj;
  }

  public static <T> T requireNonNull(T obj, String msg) {
    if (obj == null) {
      throw new NullPointerException(msg);
    }
    return obj;
  }

  public static int hashCode(Object o) {
    return o == null ? 0 : o.hashCode();
  }

  public static int hash(Object... values) {
    return Arrays.hashCode(values);
  }

  public static String toString(Object o) {
    return o == null ? "null" : o.toString();
  }

  public static boolean equals(Object a, Object b) {
    if (a == null) {
      return b == null ? true : false;
    }

    return b == null ? false : a.equals(b);
  }
}
