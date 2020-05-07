/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Orders extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3942121342975046559L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Orders\",\"namespace\":\"com.example\",\"fields\":[{\"name\":\"order_id\",\"type\":\"int\",\"doc\":\"Order Id Number\"},{\"name\":\"item_name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Order Name\"},{\"name\":\"quantity\",\"type\":\"int\",\"doc\":\"Number of Items\"},{\"name\":\"address\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Delivery Adress\"},{\"name\":\"customer_id\",\"type\":\"int\",\"doc\":\"Customer Id\"},{\"name\":\"payment_status\",\"type\":\"boolean\",\"doc\":\"Field indicating if the payment success or fail\",\"default\":true}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Orders> ENCODER =
      new BinaryMessageEncoder<Orders>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Orders> DECODER =
      new BinaryMessageDecoder<Orders>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Orders> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Orders> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Orders> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Orders>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Orders to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Orders from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Orders instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Orders fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Order Id Number */
   private int order_id;
  /** Order Name */
   private java.lang.String item_name;
  /** Number of Items */
   private int quantity;
  /** Delivery Adress */
   private java.lang.String address;
  /** Customer Id */
   private int customer_id;
  /** Field indicating if the payment success or fail */
   private boolean payment_status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Orders() {}

  /**
   * All-args constructor.
   * @param order_id Order Id Number
   * @param item_name Order Name
   * @param quantity Number of Items
   * @param address Delivery Adress
   * @param customer_id Customer Id
   * @param payment_status Field indicating if the payment success or fail
   */
  public Orders(java.lang.Integer order_id, java.lang.String item_name, java.lang.Integer quantity, java.lang.String address, java.lang.Integer customer_id, java.lang.Boolean payment_status) {
    this.order_id = order_id;
    this.item_name = item_name;
    this.quantity = quantity;
    this.address = address;
    this.customer_id = customer_id;
    this.payment_status = payment_status;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return order_id;
    case 1: return item_name;
    case 2: return quantity;
    case 3: return address;
    case 4: return customer_id;
    case 5: return payment_status;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: order_id = (java.lang.Integer)value$; break;
    case 1: item_name = (java.lang.String)value$; break;
    case 2: quantity = (java.lang.Integer)value$; break;
    case 3: address = (java.lang.String)value$; break;
    case 4: customer_id = (java.lang.Integer)value$; break;
    case 5: payment_status = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'order_id' field.
   * @return Order Id Number
   */
  public int getOrderId() {
    return order_id;
  }



  /**
   * Gets the value of the 'item_name' field.
   * @return Order Name
   */
  public java.lang.String getItemName() {
    return item_name;
  }



  /**
   * Gets the value of the 'quantity' field.
   * @return Number of Items
   */
  public int getQuantity() {
    return quantity;
  }



  /**
   * Gets the value of the 'address' field.
   * @return Delivery Adress
   */
  public java.lang.String getAddress() {
    return address;
  }



  /**
   * Gets the value of the 'customer_id' field.
   * @return Customer Id
   */
  public int getCustomerId() {
    return customer_id;
  }



  /**
   * Gets the value of the 'payment_status' field.
   * @return Field indicating if the payment success or fail
   */
  public boolean getPaymentStatus() {
    return payment_status;
  }



  /**
   * Creates a new Orders RecordBuilder.
   * @return A new Orders RecordBuilder
   */
  public static com.example.Orders.Builder newBuilder() {
    return new com.example.Orders.Builder();
  }

  /**
   * Creates a new Orders RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Orders RecordBuilder
   */
  public static com.example.Orders.Builder newBuilder(com.example.Orders.Builder other) {
    if (other == null) {
      return new com.example.Orders.Builder();
    } else {
      return new com.example.Orders.Builder(other);
    }
  }

  /**
   * Creates a new Orders RecordBuilder by copying an existing Orders instance.
   * @param other The existing instance to copy.
   * @return A new Orders RecordBuilder
   */
  public static com.example.Orders.Builder newBuilder(com.example.Orders other) {
    if (other == null) {
      return new com.example.Orders.Builder();
    } else {
      return new com.example.Orders.Builder(other);
    }
  }

  /**
   * RecordBuilder for Orders instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Orders>
    implements org.apache.avro.data.RecordBuilder<Orders> {

    /** Order Id Number */
    private int order_id;
    /** Order Name */
    private java.lang.String item_name;
    /** Number of Items */
    private int quantity;
    /** Delivery Adress */
    private java.lang.String address;
    /** Customer Id */
    private int customer_id;
    /** Field indicating if the payment success or fail */
    private boolean payment_status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.Orders.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.order_id)) {
        this.order_id = data().deepCopy(fields()[0].schema(), other.order_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.item_name)) {
        this.item_name = data().deepCopy(fields()[1].schema(), other.item_name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.quantity)) {
        this.quantity = data().deepCopy(fields()[2].schema(), other.quantity);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.address)) {
        this.address = data().deepCopy(fields()[3].schema(), other.address);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.customer_id)) {
        this.customer_id = data().deepCopy(fields()[4].schema(), other.customer_id);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.payment_status)) {
        this.payment_status = data().deepCopy(fields()[5].schema(), other.payment_status);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing Orders instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.Orders other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.order_id)) {
        this.order_id = data().deepCopy(fields()[0].schema(), other.order_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.item_name)) {
        this.item_name = data().deepCopy(fields()[1].schema(), other.item_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.quantity)) {
        this.quantity = data().deepCopy(fields()[2].schema(), other.quantity);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.address)) {
        this.address = data().deepCopy(fields()[3].schema(), other.address);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.customer_id)) {
        this.customer_id = data().deepCopy(fields()[4].schema(), other.customer_id);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.payment_status)) {
        this.payment_status = data().deepCopy(fields()[5].schema(), other.payment_status);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'order_id' field.
      * Order Id Number
      * @return The value.
      */
    public int getOrderId() {
      return order_id;
    }


    /**
      * Sets the value of the 'order_id' field.
      * Order Id Number
      * @param value The value of 'order_id'.
      * @return This builder.
      */
    public com.example.Orders.Builder setOrderId(int value) {
      validate(fields()[0], value);
      this.order_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'order_id' field has been set.
      * Order Id Number
      * @return True if the 'order_id' field has been set, false otherwise.
      */
    public boolean hasOrderId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'order_id' field.
      * Order Id Number
      * @return This builder.
      */
    public com.example.Orders.Builder clearOrderId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'item_name' field.
      * Order Name
      * @return The value.
      */
    public java.lang.String getItemName() {
      return item_name;
    }


    /**
      * Sets the value of the 'item_name' field.
      * Order Name
      * @param value The value of 'item_name'.
      * @return This builder.
      */
    public com.example.Orders.Builder setItemName(java.lang.String value) {
      validate(fields()[1], value);
      this.item_name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'item_name' field has been set.
      * Order Name
      * @return True if the 'item_name' field has been set, false otherwise.
      */
    public boolean hasItemName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'item_name' field.
      * Order Name
      * @return This builder.
      */
    public com.example.Orders.Builder clearItemName() {
      item_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * Number of Items
      * @return The value.
      */
    public int getQuantity() {
      return quantity;
    }


    /**
      * Sets the value of the 'quantity' field.
      * Number of Items
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public com.example.Orders.Builder setQuantity(int value) {
      validate(fields()[2], value);
      this.quantity = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * Number of Items
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'quantity' field.
      * Number of Items
      * @return This builder.
      */
    public com.example.Orders.Builder clearQuantity() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * Delivery Adress
      * @return The value.
      */
    public java.lang.String getAddress() {
      return address;
    }


    /**
      * Sets the value of the 'address' field.
      * Delivery Adress
      * @param value The value of 'address'.
      * @return This builder.
      */
    public com.example.Orders.Builder setAddress(java.lang.String value) {
      validate(fields()[3], value);
      this.address = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * Delivery Adress
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'address' field.
      * Delivery Adress
      * @return This builder.
      */
    public com.example.Orders.Builder clearAddress() {
      address = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'customer_id' field.
      * Customer Id
      * @return The value.
      */
    public int getCustomerId() {
      return customer_id;
    }


    /**
      * Sets the value of the 'customer_id' field.
      * Customer Id
      * @param value The value of 'customer_id'.
      * @return This builder.
      */
    public com.example.Orders.Builder setCustomerId(int value) {
      validate(fields()[4], value);
      this.customer_id = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'customer_id' field has been set.
      * Customer Id
      * @return True if the 'customer_id' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'customer_id' field.
      * Customer Id
      * @return This builder.
      */
    public com.example.Orders.Builder clearCustomerId() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'payment_status' field.
      * Field indicating if the payment success or fail
      * @return The value.
      */
    public boolean getPaymentStatus() {
      return payment_status;
    }


    /**
      * Sets the value of the 'payment_status' field.
      * Field indicating if the payment success or fail
      * @param value The value of 'payment_status'.
      * @return This builder.
      */
    public com.example.Orders.Builder setPaymentStatus(boolean value) {
      validate(fields()[5], value);
      this.payment_status = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'payment_status' field has been set.
      * Field indicating if the payment success or fail
      * @return True if the 'payment_status' field has been set, false otherwise.
      */
    public boolean hasPaymentStatus() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'payment_status' field.
      * Field indicating if the payment success or fail
      * @return This builder.
      */
    public com.example.Orders.Builder clearPaymentStatus() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Orders build() {
      try {
        Orders record = new Orders();
        record.order_id = fieldSetFlags()[0] ? this.order_id : (java.lang.Integer) defaultValue(fields()[0]);
        record.item_name = fieldSetFlags()[1] ? this.item_name : (java.lang.String) defaultValue(fields()[1]);
        record.quantity = fieldSetFlags()[2] ? this.quantity : (java.lang.Integer) defaultValue(fields()[2]);
        record.address = fieldSetFlags()[3] ? this.address : (java.lang.String) defaultValue(fields()[3]);
        record.customer_id = fieldSetFlags()[4] ? this.customer_id : (java.lang.Integer) defaultValue(fields()[4]);
        record.payment_status = fieldSetFlags()[5] ? this.payment_status : (java.lang.Boolean) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Orders>
    WRITER$ = (org.apache.avro.io.DatumWriter<Orders>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Orders>
    READER$ = (org.apache.avro.io.DatumReader<Orders>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.order_id);

    out.writeString(this.item_name);

    out.writeInt(this.quantity);

    out.writeString(this.address);

    out.writeInt(this.customer_id);

    out.writeBoolean(this.payment_status);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.order_id = in.readInt();

      this.item_name = in.readString();

      this.quantity = in.readInt();

      this.address = in.readString();

      this.customer_id = in.readInt();

      this.payment_status = in.readBoolean();

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.order_id = in.readInt();
          break;

        case 1:
          this.item_name = in.readString();
          break;

        case 2:
          this.quantity = in.readInt();
          break;

        case 3:
          this.address = in.readString();
          break;

        case 4:
          this.customer_id = in.readInt();
          break;

        case 5:
          this.payment_status = in.readBoolean();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









