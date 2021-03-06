/**
 * Autogenerated by Thrift Compiler (0.8.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package dk.diku.poets.gen.thrift.value;

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

public class Duration implements org.apache.thrift.TBase<Duration, Duration._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Duration");

  private static final org.apache.thrift.protocol.TField DURATION_SECONDS_FIELD_DESC = new org.apache.thrift.protocol.TField("durationSeconds", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DURATION_MINUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("durationMinutes", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField DURATION_HOURS_FIELD_DESC = new org.apache.thrift.protocol.TField("durationHours", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField DURATION_DAYS_FIELD_DESC = new org.apache.thrift.protocol.TField("durationDays", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField DURATION_WEEKS_FIELD_DESC = new org.apache.thrift.protocol.TField("durationWeeks", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField DURATION_MONTHS_FIELD_DESC = new org.apache.thrift.protocol.TField("durationMonths", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField DURATION_YEARS_FIELD_DESC = new org.apache.thrift.protocol.TField("durationYears", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DurationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DurationTupleSchemeFactory());
  }

  public int durationSeconds; // required
  public int durationMinutes; // required
  public int durationHours; // required
  public int durationDays; // required
  public int durationWeeks; // required
  public int durationMonths; // required
  public int durationYears; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DURATION_SECONDS((short)1, "durationSeconds"),
    DURATION_MINUTES((short)2, "durationMinutes"),
    DURATION_HOURS((short)3, "durationHours"),
    DURATION_DAYS((short)4, "durationDays"),
    DURATION_WEEKS((short)5, "durationWeeks"),
    DURATION_MONTHS((short)6, "durationMonths"),
    DURATION_YEARS((short)7, "durationYears");

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
        case 1: // DURATION_SECONDS
          return DURATION_SECONDS;
        case 2: // DURATION_MINUTES
          return DURATION_MINUTES;
        case 3: // DURATION_HOURS
          return DURATION_HOURS;
        case 4: // DURATION_DAYS
          return DURATION_DAYS;
        case 5: // DURATION_WEEKS
          return DURATION_WEEKS;
        case 6: // DURATION_MONTHS
          return DURATION_MONTHS;
        case 7: // DURATION_YEARS
          return DURATION_YEARS;
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
  private static final int __DURATIONSECONDS_ISSET_ID = 0;
  private static final int __DURATIONMINUTES_ISSET_ID = 1;
  private static final int __DURATIONHOURS_ISSET_ID = 2;
  private static final int __DURATIONDAYS_ISSET_ID = 3;
  private static final int __DURATIONWEEKS_ISSET_ID = 4;
  private static final int __DURATIONMONTHS_ISSET_ID = 5;
  private static final int __DURATIONYEARS_ISSET_ID = 6;
  private BitSet __isset_bit_vector = new BitSet(7);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DURATION_SECONDS, new org.apache.thrift.meta_data.FieldMetaData("durationSeconds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DURATION_MINUTES, new org.apache.thrift.meta_data.FieldMetaData("durationMinutes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DURATION_HOURS, new org.apache.thrift.meta_data.FieldMetaData("durationHours", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DURATION_DAYS, new org.apache.thrift.meta_data.FieldMetaData("durationDays", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DURATION_WEEKS, new org.apache.thrift.meta_data.FieldMetaData("durationWeeks", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DURATION_MONTHS, new org.apache.thrift.meta_data.FieldMetaData("durationMonths", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DURATION_YEARS, new org.apache.thrift.meta_data.FieldMetaData("durationYears", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Duration.class, metaDataMap);
  }

  public Duration() {
  }

  public Duration(
    int durationSeconds,
    int durationMinutes,
    int durationHours,
    int durationDays,
    int durationWeeks,
    int durationMonths,
    int durationYears)
  {
    this();
    this.durationSeconds = durationSeconds;
    setDurationSecondsIsSet(true);
    this.durationMinutes = durationMinutes;
    setDurationMinutesIsSet(true);
    this.durationHours = durationHours;
    setDurationHoursIsSet(true);
    this.durationDays = durationDays;
    setDurationDaysIsSet(true);
    this.durationWeeks = durationWeeks;
    setDurationWeeksIsSet(true);
    this.durationMonths = durationMonths;
    setDurationMonthsIsSet(true);
    this.durationYears = durationYears;
    setDurationYearsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Duration(Duration other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.durationSeconds = other.durationSeconds;
    this.durationMinutes = other.durationMinutes;
    this.durationHours = other.durationHours;
    this.durationDays = other.durationDays;
    this.durationWeeks = other.durationWeeks;
    this.durationMonths = other.durationMonths;
    this.durationYears = other.durationYears;
  }

  public Duration deepCopy() {
    return new Duration(this);
  }

  @Override
  public void clear() {
    setDurationSecondsIsSet(false);
    this.durationSeconds = 0;
    setDurationMinutesIsSet(false);
    this.durationMinutes = 0;
    setDurationHoursIsSet(false);
    this.durationHours = 0;
    setDurationDaysIsSet(false);
    this.durationDays = 0;
    setDurationWeeksIsSet(false);
    this.durationWeeks = 0;
    setDurationMonthsIsSet(false);
    this.durationMonths = 0;
    setDurationYearsIsSet(false);
    this.durationYears = 0;
  }

  public int getDurationSeconds() {
    return this.durationSeconds;
  }

  public Duration setDurationSeconds(int durationSeconds) {
    this.durationSeconds = durationSeconds;
    setDurationSecondsIsSet(true);
    return this;
  }

  public void unsetDurationSeconds() {
    __isset_bit_vector.clear(__DURATIONSECONDS_ISSET_ID);
  }

  /** Returns true if field durationSeconds is set (has been assigned a value) and false otherwise */
  public boolean isSetDurationSeconds() {
    return __isset_bit_vector.get(__DURATIONSECONDS_ISSET_ID);
  }

  public void setDurationSecondsIsSet(boolean value) {
    __isset_bit_vector.set(__DURATIONSECONDS_ISSET_ID, value);
  }

  public int getDurationMinutes() {
    return this.durationMinutes;
  }

  public Duration setDurationMinutes(int durationMinutes) {
    this.durationMinutes = durationMinutes;
    setDurationMinutesIsSet(true);
    return this;
  }

  public void unsetDurationMinutes() {
    __isset_bit_vector.clear(__DURATIONMINUTES_ISSET_ID);
  }

  /** Returns true if field durationMinutes is set (has been assigned a value) and false otherwise */
  public boolean isSetDurationMinutes() {
    return __isset_bit_vector.get(__DURATIONMINUTES_ISSET_ID);
  }

  public void setDurationMinutesIsSet(boolean value) {
    __isset_bit_vector.set(__DURATIONMINUTES_ISSET_ID, value);
  }

  public int getDurationHours() {
    return this.durationHours;
  }

  public Duration setDurationHours(int durationHours) {
    this.durationHours = durationHours;
    setDurationHoursIsSet(true);
    return this;
  }

  public void unsetDurationHours() {
    __isset_bit_vector.clear(__DURATIONHOURS_ISSET_ID);
  }

  /** Returns true if field durationHours is set (has been assigned a value) and false otherwise */
  public boolean isSetDurationHours() {
    return __isset_bit_vector.get(__DURATIONHOURS_ISSET_ID);
  }

  public void setDurationHoursIsSet(boolean value) {
    __isset_bit_vector.set(__DURATIONHOURS_ISSET_ID, value);
  }

  public int getDurationDays() {
    return this.durationDays;
  }

  public Duration setDurationDays(int durationDays) {
    this.durationDays = durationDays;
    setDurationDaysIsSet(true);
    return this;
  }

  public void unsetDurationDays() {
    __isset_bit_vector.clear(__DURATIONDAYS_ISSET_ID);
  }

  /** Returns true if field durationDays is set (has been assigned a value) and false otherwise */
  public boolean isSetDurationDays() {
    return __isset_bit_vector.get(__DURATIONDAYS_ISSET_ID);
  }

  public void setDurationDaysIsSet(boolean value) {
    __isset_bit_vector.set(__DURATIONDAYS_ISSET_ID, value);
  }

  public int getDurationWeeks() {
    return this.durationWeeks;
  }

  public Duration setDurationWeeks(int durationWeeks) {
    this.durationWeeks = durationWeeks;
    setDurationWeeksIsSet(true);
    return this;
  }

  public void unsetDurationWeeks() {
    __isset_bit_vector.clear(__DURATIONWEEKS_ISSET_ID);
  }

  /** Returns true if field durationWeeks is set (has been assigned a value) and false otherwise */
  public boolean isSetDurationWeeks() {
    return __isset_bit_vector.get(__DURATIONWEEKS_ISSET_ID);
  }

  public void setDurationWeeksIsSet(boolean value) {
    __isset_bit_vector.set(__DURATIONWEEKS_ISSET_ID, value);
  }

  public int getDurationMonths() {
    return this.durationMonths;
  }

  public Duration setDurationMonths(int durationMonths) {
    this.durationMonths = durationMonths;
    setDurationMonthsIsSet(true);
    return this;
  }

  public void unsetDurationMonths() {
    __isset_bit_vector.clear(__DURATIONMONTHS_ISSET_ID);
  }

  /** Returns true if field durationMonths is set (has been assigned a value) and false otherwise */
  public boolean isSetDurationMonths() {
    return __isset_bit_vector.get(__DURATIONMONTHS_ISSET_ID);
  }

  public void setDurationMonthsIsSet(boolean value) {
    __isset_bit_vector.set(__DURATIONMONTHS_ISSET_ID, value);
  }

  public int getDurationYears() {
    return this.durationYears;
  }

  public Duration setDurationYears(int durationYears) {
    this.durationYears = durationYears;
    setDurationYearsIsSet(true);
    return this;
  }

  public void unsetDurationYears() {
    __isset_bit_vector.clear(__DURATIONYEARS_ISSET_ID);
  }

  /** Returns true if field durationYears is set (has been assigned a value) and false otherwise */
  public boolean isSetDurationYears() {
    return __isset_bit_vector.get(__DURATIONYEARS_ISSET_ID);
  }

  public void setDurationYearsIsSet(boolean value) {
    __isset_bit_vector.set(__DURATIONYEARS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DURATION_SECONDS:
      if (value == null) {
        unsetDurationSeconds();
      } else {
        setDurationSeconds((Integer)value);
      }
      break;

    case DURATION_MINUTES:
      if (value == null) {
        unsetDurationMinutes();
      } else {
        setDurationMinutes((Integer)value);
      }
      break;

    case DURATION_HOURS:
      if (value == null) {
        unsetDurationHours();
      } else {
        setDurationHours((Integer)value);
      }
      break;

    case DURATION_DAYS:
      if (value == null) {
        unsetDurationDays();
      } else {
        setDurationDays((Integer)value);
      }
      break;

    case DURATION_WEEKS:
      if (value == null) {
        unsetDurationWeeks();
      } else {
        setDurationWeeks((Integer)value);
      }
      break;

    case DURATION_MONTHS:
      if (value == null) {
        unsetDurationMonths();
      } else {
        setDurationMonths((Integer)value);
      }
      break;

    case DURATION_YEARS:
      if (value == null) {
        unsetDurationYears();
      } else {
        setDurationYears((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DURATION_SECONDS:
      return Integer.valueOf(getDurationSeconds());

    case DURATION_MINUTES:
      return Integer.valueOf(getDurationMinutes());

    case DURATION_HOURS:
      return Integer.valueOf(getDurationHours());

    case DURATION_DAYS:
      return Integer.valueOf(getDurationDays());

    case DURATION_WEEKS:
      return Integer.valueOf(getDurationWeeks());

    case DURATION_MONTHS:
      return Integer.valueOf(getDurationMonths());

    case DURATION_YEARS:
      return Integer.valueOf(getDurationYears());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DURATION_SECONDS:
      return isSetDurationSeconds();
    case DURATION_MINUTES:
      return isSetDurationMinutes();
    case DURATION_HOURS:
      return isSetDurationHours();
    case DURATION_DAYS:
      return isSetDurationDays();
    case DURATION_WEEKS:
      return isSetDurationWeeks();
    case DURATION_MONTHS:
      return isSetDurationMonths();
    case DURATION_YEARS:
      return isSetDurationYears();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Duration)
      return this.equals((Duration)that);
    return false;
  }

  public boolean equals(Duration that) {
    if (that == null)
      return false;

    boolean this_present_durationSeconds = true;
    boolean that_present_durationSeconds = true;
    if (this_present_durationSeconds || that_present_durationSeconds) {
      if (!(this_present_durationSeconds && that_present_durationSeconds))
        return false;
      if (this.durationSeconds != that.durationSeconds)
        return false;
    }

    boolean this_present_durationMinutes = true;
    boolean that_present_durationMinutes = true;
    if (this_present_durationMinutes || that_present_durationMinutes) {
      if (!(this_present_durationMinutes && that_present_durationMinutes))
        return false;
      if (this.durationMinutes != that.durationMinutes)
        return false;
    }

    boolean this_present_durationHours = true;
    boolean that_present_durationHours = true;
    if (this_present_durationHours || that_present_durationHours) {
      if (!(this_present_durationHours && that_present_durationHours))
        return false;
      if (this.durationHours != that.durationHours)
        return false;
    }

    boolean this_present_durationDays = true;
    boolean that_present_durationDays = true;
    if (this_present_durationDays || that_present_durationDays) {
      if (!(this_present_durationDays && that_present_durationDays))
        return false;
      if (this.durationDays != that.durationDays)
        return false;
    }

    boolean this_present_durationWeeks = true;
    boolean that_present_durationWeeks = true;
    if (this_present_durationWeeks || that_present_durationWeeks) {
      if (!(this_present_durationWeeks && that_present_durationWeeks))
        return false;
      if (this.durationWeeks != that.durationWeeks)
        return false;
    }

    boolean this_present_durationMonths = true;
    boolean that_present_durationMonths = true;
    if (this_present_durationMonths || that_present_durationMonths) {
      if (!(this_present_durationMonths && that_present_durationMonths))
        return false;
      if (this.durationMonths != that.durationMonths)
        return false;
    }

    boolean this_present_durationYears = true;
    boolean that_present_durationYears = true;
    if (this_present_durationYears || that_present_durationYears) {
      if (!(this_present_durationYears && that_present_durationYears))
        return false;
      if (this.durationYears != that.durationYears)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Duration other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Duration typedOther = (Duration)other;

    lastComparison = Boolean.valueOf(isSetDurationSeconds()).compareTo(typedOther.isSetDurationSeconds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDurationSeconds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.durationSeconds, typedOther.durationSeconds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDurationMinutes()).compareTo(typedOther.isSetDurationMinutes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDurationMinutes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.durationMinutes, typedOther.durationMinutes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDurationHours()).compareTo(typedOther.isSetDurationHours());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDurationHours()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.durationHours, typedOther.durationHours);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDurationDays()).compareTo(typedOther.isSetDurationDays());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDurationDays()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.durationDays, typedOther.durationDays);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDurationWeeks()).compareTo(typedOther.isSetDurationWeeks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDurationWeeks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.durationWeeks, typedOther.durationWeeks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDurationMonths()).compareTo(typedOther.isSetDurationMonths());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDurationMonths()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.durationMonths, typedOther.durationMonths);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDurationYears()).compareTo(typedOther.isSetDurationYears());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDurationYears()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.durationYears, typedOther.durationYears);
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
    StringBuilder sb = new StringBuilder("Duration(");
    boolean first = true;

    sb.append("durationSeconds:");
    sb.append(this.durationSeconds);
    first = false;
    if (!first) sb.append(", ");
    sb.append("durationMinutes:");
    sb.append(this.durationMinutes);
    first = false;
    if (!first) sb.append(", ");
    sb.append("durationHours:");
    sb.append(this.durationHours);
    first = false;
    if (!first) sb.append(", ");
    sb.append("durationDays:");
    sb.append(this.durationDays);
    first = false;
    if (!first) sb.append(", ");
    sb.append("durationWeeks:");
    sb.append(this.durationWeeks);
    first = false;
    if (!first) sb.append(", ");
    sb.append("durationMonths:");
    sb.append(this.durationMonths);
    first = false;
    if (!first) sb.append(", ");
    sb.append("durationYears:");
    sb.append(this.durationYears);
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

  private static class DurationStandardSchemeFactory implements SchemeFactory {
    public DurationStandardScheme getScheme() {
      return new DurationStandardScheme();
    }
  }

  private static class DurationStandardScheme extends StandardScheme<Duration> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Duration struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DURATION_SECONDS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.durationSeconds = iprot.readI32();
              struct.setDurationSecondsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DURATION_MINUTES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.durationMinutes = iprot.readI32();
              struct.setDurationMinutesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DURATION_HOURS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.durationHours = iprot.readI32();
              struct.setDurationHoursIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DURATION_DAYS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.durationDays = iprot.readI32();
              struct.setDurationDaysIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DURATION_WEEKS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.durationWeeks = iprot.readI32();
              struct.setDurationWeeksIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DURATION_MONTHS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.durationMonths = iprot.readI32();
              struct.setDurationMonthsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DURATION_YEARS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.durationYears = iprot.readI32();
              struct.setDurationYearsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Duration struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DURATION_SECONDS_FIELD_DESC);
      oprot.writeI32(struct.durationSeconds);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DURATION_MINUTES_FIELD_DESC);
      oprot.writeI32(struct.durationMinutes);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DURATION_HOURS_FIELD_DESC);
      oprot.writeI32(struct.durationHours);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DURATION_DAYS_FIELD_DESC);
      oprot.writeI32(struct.durationDays);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DURATION_WEEKS_FIELD_DESC);
      oprot.writeI32(struct.durationWeeks);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DURATION_MONTHS_FIELD_DESC);
      oprot.writeI32(struct.durationMonths);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DURATION_YEARS_FIELD_DESC);
      oprot.writeI32(struct.durationYears);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DurationTupleSchemeFactory implements SchemeFactory {
    public DurationTupleScheme getScheme() {
      return new DurationTupleScheme();
    }
  }

  private static class DurationTupleScheme extends TupleScheme<Duration> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Duration struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDurationSeconds()) {
        optionals.set(0);
      }
      if (struct.isSetDurationMinutes()) {
        optionals.set(1);
      }
      if (struct.isSetDurationHours()) {
        optionals.set(2);
      }
      if (struct.isSetDurationDays()) {
        optionals.set(3);
      }
      if (struct.isSetDurationWeeks()) {
        optionals.set(4);
      }
      if (struct.isSetDurationMonths()) {
        optionals.set(5);
      }
      if (struct.isSetDurationYears()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetDurationSeconds()) {
        oprot.writeI32(struct.durationSeconds);
      }
      if (struct.isSetDurationMinutes()) {
        oprot.writeI32(struct.durationMinutes);
      }
      if (struct.isSetDurationHours()) {
        oprot.writeI32(struct.durationHours);
      }
      if (struct.isSetDurationDays()) {
        oprot.writeI32(struct.durationDays);
      }
      if (struct.isSetDurationWeeks()) {
        oprot.writeI32(struct.durationWeeks);
      }
      if (struct.isSetDurationMonths()) {
        oprot.writeI32(struct.durationMonths);
      }
      if (struct.isSetDurationYears()) {
        oprot.writeI32(struct.durationYears);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Duration struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.durationSeconds = iprot.readI32();
        struct.setDurationSecondsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.durationMinutes = iprot.readI32();
        struct.setDurationMinutesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.durationHours = iprot.readI32();
        struct.setDurationHoursIsSet(true);
      }
      if (incoming.get(3)) {
        struct.durationDays = iprot.readI32();
        struct.setDurationDaysIsSet(true);
      }
      if (incoming.get(4)) {
        struct.durationWeeks = iprot.readI32();
        struct.setDurationWeeksIsSet(true);
      }
      if (incoming.get(5)) {
        struct.durationMonths = iprot.readI32();
        struct.setDurationMonthsIsSet(true);
      }
      if (incoming.get(6)) {
        struct.durationYears = iprot.readI32();
        struct.setDurationYearsIsSet(true);
      }
    }
  }

}

