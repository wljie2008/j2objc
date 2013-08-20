/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package java.lang.reflect;

import java.lang.annotation.Annotation;

/**
 * Stub implementation of Method.  The actual implementation
 * is in Method.h and Method.m, so the declared methods in this
 * class should match the actual methods implemented in order
 * to catch unsupported API references.
 *
 * @see Object
 */
public class Method extends AccessibleObject implements GenericDeclaration, Member {

  public String getName() {
    return null;
  }
  
  public int getModifiers() {
    return 0;
  }
  
  public Class getReturnType() {
    return null;
  }

  public Type getGenericReturnType() {
    return null;
  }
  
  public Class<?> getDeclaringClass() {
    return null;
  }
  
  public Class<?>[] getParameterTypes() {
    return null;
  }

  public Type[] getGenericParameterTypes() {
    return null;
  }

  public Object invoke(Object o, Object... args)
      throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    return null;
  }
  
  public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
    return null;
  }

  public Annotation[] getDeclaredAnnotations() {
    return null;
  }
  
  public Annotation[][] getParameterAnnotations() {
    return null;
  }
  
  public TypeVariable<Method>[] getTypeParameters() {
    return null;
  }
  
  public boolean isSynthetic() {
    return false;
  }
  
  /* Not implemented
  public Class[] getExceptionTypes();
  public Type[] getGenericExceptionTypes();
  public String toGenericString();
  public boolean isBridge();
  public boolean isVarArgs();
  public Object getDefaultValue();
  */
}
