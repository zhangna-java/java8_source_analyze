package org.omg.PortableInterceptor.ORBInitInfoPackage;


/**
* org/omg/PortableInterceptor/ORBInitInfoPackage/InvalidName.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u181/11358/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Saturday, July 7, 2018 1:04:12 AM PDT
*/

public final class InvalidName extends org.omg.CORBA.UserException
{

  public InvalidName ()
  {
    super(InvalidNameHelper.id());
  } // ctor


  public InvalidName (String $reason)
  {
    super(InvalidNameHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidName
