package me.majbar.commonapi

import java.lang.RuntimeException

abstract class OutOfSoldException(message : String)
    : RuntimeException(message);
class ProductOutOfSoldException(message : String) :
    OutOfSoldException(message);