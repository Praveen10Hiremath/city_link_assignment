package com.citylink.model;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BookingDatabase_Impl extends BookingDatabase {
  private volatile BookingDao _bookingDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `BookingModel` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `context` TEXT, `type` TEXT, `bookingId` TEXT, `status` TEXT, `bookingTime` TEXT, `pickupTime` TEXT, `bid` TEXT, `customerFullName` TEXT, `mobile` TEXT, `email` TEXT, `sourecAdressName` TEXT, `sourceLatitude` TEXT, `sourceLongitude` TEXT, `sourceAddress` TEXT, `sourceLocation` TEXT, `sourceCity` TEXT, `sourceState` TEXT, `sourcePostalCode` TEXT, `sourceCountry` TEXT, `destinationAdressName` TEXT, `destinationAddress` TEXT, `destinationLocation` TEXT, `destinantionCity` TEXT, `destinationState` TEXT, `destinationPostalCode` TEXT, `destinationCountry` TEXT, `destinationLatitude` TEXT, `destinationLongitude` TEXT, `vedorId` TEXT, `vendorFullName` TEXT, `vendorVehicleNumber` TEXT, `vendorVehicleModel` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ecfbdc59250becdba032db28395e7367')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `BookingModel`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsBookingModel = new HashMap<String, TableInfo.Column>(33);
        _columnsBookingModel.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("context", new TableInfo.Column("context", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("bookingId", new TableInfo.Column("bookingId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("bookingTime", new TableInfo.Column("bookingTime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("pickupTime", new TableInfo.Column("pickupTime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("bid", new TableInfo.Column("bid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("customerFullName", new TableInfo.Column("customerFullName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("mobile", new TableInfo.Column("mobile", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("sourecAdressName", new TableInfo.Column("sourecAdressName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("sourceLatitude", new TableInfo.Column("sourceLatitude", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("sourceLongitude", new TableInfo.Column("sourceLongitude", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("sourceAddress", new TableInfo.Column("sourceAddress", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("sourceLocation", new TableInfo.Column("sourceLocation", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("sourceCity", new TableInfo.Column("sourceCity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("sourceState", new TableInfo.Column("sourceState", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("sourcePostalCode", new TableInfo.Column("sourcePostalCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("sourceCountry", new TableInfo.Column("sourceCountry", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("destinationAdressName", new TableInfo.Column("destinationAdressName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("destinationAddress", new TableInfo.Column("destinationAddress", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("destinationLocation", new TableInfo.Column("destinationLocation", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("destinantionCity", new TableInfo.Column("destinantionCity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("destinationState", new TableInfo.Column("destinationState", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("destinationPostalCode", new TableInfo.Column("destinationPostalCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("destinationCountry", new TableInfo.Column("destinationCountry", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("destinationLatitude", new TableInfo.Column("destinationLatitude", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("destinationLongitude", new TableInfo.Column("destinationLongitude", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("vedorId", new TableInfo.Column("vedorId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("vendorFullName", new TableInfo.Column("vendorFullName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("vendorVehicleNumber", new TableInfo.Column("vendorVehicleNumber", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookingModel.put("vendorVehicleModel", new TableInfo.Column("vendorVehicleModel", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBookingModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBookingModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBookingModel = new TableInfo("BookingModel", _columnsBookingModel, _foreignKeysBookingModel, _indicesBookingModel);
        final TableInfo _existingBookingModel = TableInfo.read(_db, "BookingModel");
        if (! _infoBookingModel.equals(_existingBookingModel)) {
          return new RoomOpenHelper.ValidationResult(false, "BookingModel(com.citylink.model.BookingModel).\n"
                  + " Expected:\n" + _infoBookingModel + "\n"
                  + " Found:\n" + _existingBookingModel);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ecfbdc59250becdba032db28395e7367", "c76cd464c496e7f7abfe84923417aa77");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "BookingModel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `BookingModel`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public BookingDao Dao() {
    if (_bookingDao != null) {
      return _bookingDao;
    } else {
      synchronized(this) {
        if(_bookingDao == null) {
          _bookingDao = new BookingDao_Impl(this);
        }
        return _bookingDao;
      }
    }
  }
}
