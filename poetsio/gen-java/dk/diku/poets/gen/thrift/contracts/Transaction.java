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

public class Transaction implements org.apache.thrift.TBase<Transaction, Transaction._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Transaction");

  private static final org.apache.thrift.protocol.TField CONTRACT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("contractId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TIME_STAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timeStamp", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField TRANSACTION_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("transactionData", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TransactionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TransactionTupleSchemeFactory());
  }

  public int contractId; // required
  public dk.diku.poets.gen.thrift.value.DateTime timeStamp; // required
  public dk.diku.poets.gen.thrift.value.Value transactionData; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONTRACT_ID((short)1, "contractId"),
    TIME_STAMP((short)2, "timeStamp"),
    TRANSACTION_DATA((short)3, "transactionData");

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
        case 1: // CONTRACT_ID
          return CONTRACT_ID;
        case 2: // TIME_STAMP
          return TIME_STAMP;
        case 3: // TRANSACTION_DATA
          return TRANSACTION_DATA;
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
  private static final int __CONTRACTID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONTRACT_ID, new org.apache.thrift.meta_data.FieldMetaData("contractId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "ContractId")));
    tmpMap.put(_Fields.TIME_STAMP, new org.apache.thrift.meta_data.FieldMetaData("timeStamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, dk.diku.poets.gen.thrift.value.DateTime.class)));
    tmpMap.put(_Fields.TRANSACTION_DATA, new org.apache.thrift.meta_data.FieldMetaData("transactionData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, dk.diku.poets.gen.thrift.value.Value.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Transaction.class, metaDataMap);
  }

  public Transaction() {
  }

  public Transaction(
    int contractId,
    dk.diku.poets.gen.thrift.value.DateTime timeStamp,
    dk.diku.poets.gen.thrift.value.Value transactionData)
  {
    this();
    this.contractId = contractId;
    setContractIdIsSet(true);
    this.timeStamp = timeStamp;
    this.transactionData = transactionData;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Transaction(Transaction other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.contractId = other.contractId;
    if (other.isSetTimeStamp()) {
      this.timeStamp = new dk.diku.poets.gen.thrift.value.DateTime(other.timeStamp);
    }
    if (other.isSetTransactionData()) {
      this.transactionData = new dk.diku.poets.gen.thrift.value.Value(other.transactionData);
    }
  }

  public Transaction deepCopy() {
    return new Transaction(this);
  }

  @Override
  public void clear() {
    setContractIdIsSet(false);
    this.contractId = 0;
    this.timeStamp = null;
    this.transactionData = null;
  }

  public int getContractId() {
    return this.contractId;
  }

  public Transaction setContractId(int contractId) {
    this.contractId = contractId;
    setContractIdIsSet(true);
    return this;
  }

  public void unsetContractId() {
    __isset_bit_vector.clear(__CONTRACTID_ISSET_ID);
  }

  /** Returns true if field contractId is set (has been assigned a value) and false otherwise */
  public boolean isSetContractId() {
    return __isset_bit_vector.get(__CONTRACTID_ISSET_ID);
  }

  public void setContractIdIsSet(boolean value) {
    __isset_bit_vector.set(__CONTRACTID_ISSET_ID, value);
  }

  public dk.diku.poets.gen.thrift.value.DateTime getTimeStamp() {
    return this.timeStamp;
  }

  public Transaction setTimeStamp(dk.diku.poets.gen.thrift.value.DateTime timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  public void unsetTimeStamp() {
    this.timeStamp = null;
  }

  /** Returns true if field timeStamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeStamp() {
    return this.timeStamp != null;
  }

  public void setTimeStampIsSet(boolean value) {
    if (!value) {
      this.timeStamp = null;
    }
  }

  public dk.diku.poets.gen.thrift.value.Value getTransactionData() {
    return this.transactionData;
  }

  public Transaction setTransactionData(dk.diku.poets.gen.thrift.value.Value transactionData) {
    this.transactionData = transactionData;
    return this;
  }

  public void unsetTransactionData() {
    this.transactionData = null;
  }

  /** Returns true if field transactionData is set (has been assigned a value) and false otherwise */
  public boolean isSetTransactionData() {
    return this.transactionData != null;
  }

  public void setTransactionDataIsSet(boolean value) {
    if (!value) {
      this.transactionData = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONTRACT_ID:
      if (value == null) {
        unsetContractId();
      } else {
        setContractId((Integer)value);
      }
      break;

    case TIME_STAMP:
      if (value == null) {
        unsetTimeStamp();
      } else {
        setTimeStamp((dk.diku.poets.gen.thrift.value.DateTime)value);
      }
      break;

    case TRANSACTION_DATA:
      if (value == null) {
        unsetTransactionData();
      } else {
        setTransactionData((dk.diku.poets.gen.thrift.value.Value)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONTRACT_ID:
      return Integer.valueOf(getContractId());

    case TIME_STAMP:
      return getTimeStamp();

    case TRANSACTION_DATA:
      return getTransactionData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONTRACT_ID:
      return isSetContractId();
    case TIME_STAMP:
      return isSetTimeStamp();
    case TRANSACTION_DATA:
      return isSetTransactionData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Transaction)
      return this.equals((Transaction)that);
    return false;
  }

  public boolean equals(Transaction that) {
    if (that == null)
      return false;

    boolean this_present_contractId = true;
    boolean that_present_contractId = true;
    if (this_present_contractId || that_present_contractId) {
      if (!(this_present_contractId && that_present_contractId))
        return false;
      if (this.contractId != that.contractId)
        return false;
    }

    boolean this_present_timeStamp = true && this.isSetTimeStamp();
    boolean that_present_timeStamp = true && that.isSetTimeStamp();
    if (this_present_timeStamp || that_present_timeStamp) {
      if (!(this_present_timeStamp && that_present_timeStamp))
        return false;
      if (!this.timeStamp.equals(that.timeStamp))
        return false;
    }

    boolean this_present_transactionData = true && this.isSetTransactionData();
    boolean that_present_transactionData = true && that.isSetTransactionData();
    if (this_present_transactionData || that_present_transactionData) {
      if (!(this_present_transactionData && that_present_transactionData))
        return false;
      if (!this.transactionData.equals(that.transactionData))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Transaction other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Transaction typedOther = (Transaction)other;

    lastComparison = Boolean.valueOf(isSetContractId()).compareTo(typedOther.isSetContractId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContractId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contractId, typedOther.contractId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeStamp()).compareTo(typedOther.isSetTimeStamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeStamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeStamp, typedOther.timeStamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTransactionData()).compareTo(typedOther.isSetTransactionData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransactionData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transactionData, typedOther.transactionData);
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
    StringBuilder sb = new StringBuilder("Transaction(");
    boolean first = true;

    sb.append("contractId:");
    sb.append(this.contractId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("timeStamp:");
    if (this.timeStamp == null) {
      sb.append("null");
    } else {
      sb.append(this.timeStamp);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("transactionData:");
    if (this.transactionData == null) {
      sb.append("null");
    } else {
      sb.append(this.transactionData);
    }
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

  private static class TransactionStandardSchemeFactory implements SchemeFactory {
    public TransactionStandardScheme getScheme() {
      return new TransactionStandardScheme();
    }
  }

  private static class TransactionStandardScheme extends StandardScheme<Transaction> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Transaction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONTRACT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.contractId = iprot.readI32();
              struct.setContractIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIME_STAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.timeStamp = new dk.diku.poets.gen.thrift.value.DateTime();
              struct.timeStamp.read(iprot);
              struct.setTimeStampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TRANSACTION_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.transactionData = new dk.diku.poets.gen.thrift.value.Value();
              struct.transactionData.read(iprot);
              struct.setTransactionDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Transaction struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CONTRACT_ID_FIELD_DESC);
      oprot.writeI32(struct.contractId);
      oprot.writeFieldEnd();
      if (struct.timeStamp != null) {
        oprot.writeFieldBegin(TIME_STAMP_FIELD_DESC);
        struct.timeStamp.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.transactionData != null) {
        oprot.writeFieldBegin(TRANSACTION_DATA_FIELD_DESC);
        struct.transactionData.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TransactionTupleSchemeFactory implements SchemeFactory {
    public TransactionTupleScheme getScheme() {
      return new TransactionTupleScheme();
    }
  }

  private static class TransactionTupleScheme extends TupleScheme<Transaction> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Transaction struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetContractId()) {
        optionals.set(0);
      }
      if (struct.isSetTimeStamp()) {
        optionals.set(1);
      }
      if (struct.isSetTransactionData()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetContractId()) {
        oprot.writeI32(struct.contractId);
      }
      if (struct.isSetTimeStamp()) {
        struct.timeStamp.write(oprot);
      }
      if (struct.isSetTransactionData()) {
        struct.transactionData.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Transaction struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.contractId = iprot.readI32();
        struct.setContractIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.timeStamp = new dk.diku.poets.gen.thrift.value.DateTime();
        struct.timeStamp.read(iprot);
        struct.setTimeStampIsSet(true);
      }
      if (incoming.get(2)) {
        struct.transactionData = new dk.diku.poets.gen.thrift.value.Value();
        struct.transactionData.read(iprot);
        struct.setTransactionDataIsSet(true);
      }
    }
  }

}
