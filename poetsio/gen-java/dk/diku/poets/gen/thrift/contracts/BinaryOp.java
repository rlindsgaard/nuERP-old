/**
 * Autogenerated by Thrift Compiler (0.8.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package dk.diku.poets.gen.thrift.contracts;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryOp implements org.apache.thrift.TBase<BinaryOp, BinaryOp._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BinaryOp");

  private static final org.apache.thrift.protocol.TField OPERATOR_FIELD_DESC = new org.apache.thrift.protocol.TField("operator", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LEFT_EXP_FIELD_DESC = new org.apache.thrift.protocol.TField("leftExp", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RIGHT_EXP_FIELD_DESC = new org.apache.thrift.protocol.TField("rightExp", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BinaryOpStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BinaryOpTupleSchemeFactory());
  }

  /**
   * 
   * @see BinOp
   */
  public BinOp operator; // required
  public int leftExp; // required
  public int rightExp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see BinOp
     */
    OPERATOR((short)1, "operator"),
    LEFT_EXP((short)2, "leftExp"),
    RIGHT_EXP((short)3, "rightExp");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OPERATOR
          return OPERATOR;
        case 2: // LEFT_EXP
          return LEFT_EXP;
        case 3: // RIGHT_EXP
          return RIGHT_EXP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LEFTEXP_ISSET_ID = 0;
  private static final int __RIGHTEXP_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPERATOR, new org.apache.thrift.meta_data.FieldMetaData("operator", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BinOp.class)));
    tmpMap.put(_Fields.LEFT_EXP, new org.apache.thrift.meta_data.FieldMetaData("leftExp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Index")));
    tmpMap.put(_Fields.RIGHT_EXP, new org.apache.thrift.meta_data.FieldMetaData("rightExp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Index")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BinaryOp.class, metaDataMap);
  }

  public BinaryOp() {
  }

  public BinaryOp(
    BinOp operator,
    int leftExp,
    int rightExp)
  {
    this();
    this.operator = operator;
    this.leftExp = leftExp;
    setLeftExpIsSet(true);
    this.rightExp = rightExp;
    setRightExpIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BinaryOp(BinaryOp other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetOperator()) {
      this.operator = other.operator;
    }
    this.leftExp = other.leftExp;
    this.rightExp = other.rightExp;
  }

  public BinaryOp deepCopy() {
    return new BinaryOp(this);
  }

  @Override
  public void clear() {
    this.operator = null;
    setLeftExpIsSet(false);
    this.leftExp = 0;
    setRightExpIsSet(false);
    this.rightExp = 0;
  }

  /**
   * 
   * @see BinOp
   */
  public BinOp getOperator() {
    return this.operator;
  }

  /**
   * 
   * @see BinOp
   */
  public BinaryOp setOperator(BinOp operator) {
    this.operator = operator;
    return this;
  }

  public void unsetOperator() {
    this.operator = null;
  }

  /** Returns true if field operator is set (has been assigned a value) and false otherwise */
  public boolean isSetOperator() {
    return this.operator != null;
  }

  public void setOperatorIsSet(boolean value) {
    if (!value) {
      this.operator = null;
    }
  }

  public int getLeftExp() {
    return this.leftExp;
  }

  public BinaryOp setLeftExp(int leftExp) {
    this.leftExp = leftExp;
    setLeftExpIsSet(true);
    return this;
  }

  public void unsetLeftExp() {
    __isset_bit_vector.clear(__LEFTEXP_ISSET_ID);
  }

  /** Returns true if field leftExp is set (has been assigned a value) and false otherwise */
  public boolean isSetLeftExp() {
    return __isset_bit_vector.get(__LEFTEXP_ISSET_ID);
  }

  public void setLeftExpIsSet(boolean value) {
    __isset_bit_vector.set(__LEFTEXP_ISSET_ID, value);
  }

  public int getRightExp() {
    return this.rightExp;
  }

  public BinaryOp setRightExp(int rightExp) {
    this.rightExp = rightExp;
    setRightExpIsSet(true);
    return this;
  }

  public void unsetRightExp() {
    __isset_bit_vector.clear(__RIGHTEXP_ISSET_ID);
  }

  /** Returns true if field rightExp is set (has been assigned a value) and false otherwise */
  public boolean isSetRightExp() {
    return __isset_bit_vector.get(__RIGHTEXP_ISSET_ID);
  }

  public void setRightExpIsSet(boolean value) {
    __isset_bit_vector.set(__RIGHTEXP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OPERATOR:
      if (value == null) {
        unsetOperator();
      } else {
        setOperator((BinOp)value);
      }
      break;

    case LEFT_EXP:
      if (value == null) {
        unsetLeftExp();
      } else {
        setLeftExp((Integer)value);
      }
      break;

    case RIGHT_EXP:
      if (value == null) {
        unsetRightExp();
      } else {
        setRightExp((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OPERATOR:
      return getOperator();

    case LEFT_EXP:
      return Integer.valueOf(getLeftExp());

    case RIGHT_EXP:
      return Integer.valueOf(getRightExp());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OPERATOR:
      return isSetOperator();
    case LEFT_EXP:
      return isSetLeftExp();
    case RIGHT_EXP:
      return isSetRightExp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BinaryOp)
      return this.equals((BinaryOp)that);
    return false;
  }

  public boolean equals(BinaryOp that) {
    if (that == null)
      return false;

    boolean this_present_operator = true && this.isSetOperator();
    boolean that_present_operator = true && that.isSetOperator();
    if (this_present_operator || that_present_operator) {
      if (!(this_present_operator && that_present_operator))
        return false;
      if (!this.operator.equals(that.operator))
        return false;
    }

    boolean this_present_leftExp = true;
    boolean that_present_leftExp = true;
    if (this_present_leftExp || that_present_leftExp) {
      if (!(this_present_leftExp && that_present_leftExp))
        return false;
      if (this.leftExp != that.leftExp)
        return false;
    }

    boolean this_present_rightExp = true;
    boolean that_present_rightExp = true;
    if (this_present_rightExp || that_present_rightExp) {
      if (!(this_present_rightExp && that_present_rightExp))
        return false;
      if (this.rightExp != that.rightExp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BinaryOp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BinaryOp typedOther = (BinaryOp)other;

    lastComparison = Boolean.valueOf(isSetOperator()).compareTo(typedOther.isSetOperator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperator()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operator, typedOther.operator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLeftExp()).compareTo(typedOther.isSetLeftExp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLeftExp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.leftExp, typedOther.leftExp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRightExp()).compareTo(typedOther.isSetRightExp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRightExp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rightExp, typedOther.rightExp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BinaryOp(");
    boolean first = true;

    sb.append("operator:");
    if (this.operator == null) {
      sb.append("null");
    } else {
      sb.append(this.operator);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("leftExp:");
    sb.append(this.leftExp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rightExp:");
    sb.append(this.rightExp);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BinaryOpStandardSchemeFactory implements SchemeFactory {
    public BinaryOpStandardScheme getScheme() {
      return new BinaryOpStandardScheme();
    }
  }

  private static class BinaryOpStandardScheme extends StandardScheme<BinaryOp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BinaryOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPERATOR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operator = BinOp.findByValue(iprot.readI32());
              struct.setOperatorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LEFT_EXP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.leftExp = iprot.readI32();
              struct.setLeftExpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RIGHT_EXP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.rightExp = iprot.readI32();
              struct.setRightExpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BinaryOp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.operator != null) {
        oprot.writeFieldBegin(OPERATOR_FIELD_DESC);
        oprot.writeI32(struct.operator.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LEFT_EXP_FIELD_DESC);
      oprot.writeI32(struct.leftExp);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RIGHT_EXP_FIELD_DESC);
      oprot.writeI32(struct.rightExp);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BinaryOpTupleSchemeFactory implements SchemeFactory {
    public BinaryOpTupleScheme getScheme() {
      return new BinaryOpTupleScheme();
    }
  }

  private static class BinaryOpTupleScheme extends TupleScheme<BinaryOp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BinaryOp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOperator()) {
        optionals.set(0);
      }
      if (struct.isSetLeftExp()) {
        optionals.set(1);
      }
      if (struct.isSetRightExp()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetOperator()) {
        oprot.writeI32(struct.operator.getValue());
      }
      if (struct.isSetLeftExp()) {
        oprot.writeI32(struct.leftExp);
      }
      if (struct.isSetRightExp()) {
        oprot.writeI32(struct.rightExp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BinaryOp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.operator = BinOp.findByValue(iprot.readI32());
        struct.setOperatorIsSet(true);
      }
      if (incoming.get(1)) {
        struct.leftExp = iprot.readI32();
        struct.setLeftExpIsSet(true);
      }
      if (incoming.get(2)) {
        struct.rightExp = iprot.readI32();
        struct.setRightExpIsSet(true);
      }
    }
  }

}

