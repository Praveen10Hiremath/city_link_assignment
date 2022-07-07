package com.citylink.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BookingDao_Impl implements BookingDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BookingModel> __insertionAdapterOfBookingModel;

  private final EntityDeletionOrUpdateAdapter<BookingModel> __deletionAdapterOfBookingModel;

  private final EntityDeletionOrUpdateAdapter<BookingModel> __updateAdapterOfBookingModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllCourses;

  public BookingDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookingModel = new EntityInsertionAdapter<BookingModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `BookingModel` (`id`,`context`,`type`,`bookingId`,`status`,`bookingTime`,`pickupTime`,`bid`,`customerFullName`,`mobile`,`email`,`sourecAdressName`,`sourceLatitude`,`sourceLongitude`,`sourceAddress`,`sourceLocation`,`sourceCity`,`sourceState`,`sourcePostalCode`,`sourceCountry`,`destinationAdressName`,`destinationAddress`,`destinationLocation`,`destinantionCity`,`destinationState`,`destinationPostalCode`,`destinationCountry`,`destinationLatitude`,`destinationLongitude`,`vedorId`,`vendorFullName`,`vendorVehicleNumber`,`vendorVehicleModel`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookingModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getContext() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContext());
        }
        if (value.getType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getType());
        }
        if (value.getBookingId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBookingId());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getStatus());
        }
        if (value.getBookingTime() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBookingTime());
        }
        if (value.getPickupTime() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPickupTime());
        }
        final Customer _tmpCustomer = value.getCustomer();
        if(_tmpCustomer != null) {
          if (_tmpCustomer.getBid() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpCustomer.getBid());
          }
          if (_tmpCustomer.getCustomerFullName() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpCustomer.getCustomerFullName());
          }
          if (_tmpCustomer.getMobile() == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindString(10, _tmpCustomer.getMobile());
          }
          if (_tmpCustomer.getEmail() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindString(11, _tmpCustomer.getEmail());
          }
        } else {
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
        }
        final ASource _tmpASource = value.getASource();
        if(_tmpASource != null) {
          if (_tmpASource.getSourecAdressName() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindString(12, _tmpASource.getSourecAdressName());
          }
          if (_tmpASource.getSourceLatitude() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindString(13, _tmpASource.getSourceLatitude());
          }
          if (_tmpASource.getSourceLongitude() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindString(14, _tmpASource.getSourceLongitude());
          }
          final Address _tmpSourceAddress = _tmpASource.getSourceAddress();
          if(_tmpSourceAddress != null) {
            if (_tmpSourceAddress.getSourceAddress() == null) {
              stmt.bindNull(15);
            } else {
              stmt.bindString(15, _tmpSourceAddress.getSourceAddress());
            }
            if (_tmpSourceAddress.getSourceLocation() == null) {
              stmt.bindNull(16);
            } else {
              stmt.bindString(16, _tmpSourceAddress.getSourceLocation());
            }
            if (_tmpSourceAddress.getSourceCity() == null) {
              stmt.bindNull(17);
            } else {
              stmt.bindString(17, _tmpSourceAddress.getSourceCity());
            }
            if (_tmpSourceAddress.getSourceState() == null) {
              stmt.bindNull(18);
            } else {
              stmt.bindString(18, _tmpSourceAddress.getSourceState());
            }
            if (_tmpSourceAddress.getSourcePostalCode() == null) {
              stmt.bindNull(19);
            } else {
              stmt.bindString(19, _tmpSourceAddress.getSourcePostalCode());
            }
            if (_tmpSourceAddress.getSourceCountry() == null) {
              stmt.bindNull(20);
            } else {
              stmt.bindString(20, _tmpSourceAddress.getSourceCountry());
            }
          } else {
            stmt.bindNull(15);
            stmt.bindNull(16);
            stmt.bindNull(17);
            stmt.bindNull(18);
            stmt.bindNull(19);
            stmt.bindNull(20);
          }
        } else {
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
          stmt.bindNull(15);
          stmt.bindNull(16);
          stmt.bindNull(17);
          stmt.bindNull(18);
          stmt.bindNull(19);
          stmt.bindNull(20);
        }
        final Destination _tmpDestination = value.getDestination();
        if(_tmpDestination != null) {
          if (_tmpDestination.destinationAdressName == null) {
            stmt.bindNull(21);
          } else {
            stmt.bindString(21, _tmpDestination.destinationAdressName);
          }
          final DestinationAdress _tmpDestinationAdress = _tmpDestination.getDestinationAdress();
          if(_tmpDestinationAdress != null) {
            if (_tmpDestinationAdress.getDestinationAddress() == null) {
              stmt.bindNull(22);
            } else {
              stmt.bindString(22, _tmpDestinationAdress.getDestinationAddress());
            }
            if (_tmpDestinationAdress.getDestinationLocation() == null) {
              stmt.bindNull(23);
            } else {
              stmt.bindString(23, _tmpDestinationAdress.getDestinationLocation());
            }
            if (_tmpDestinationAdress.getDestinantionCity() == null) {
              stmt.bindNull(24);
            } else {
              stmt.bindString(24, _tmpDestinationAdress.getDestinantionCity());
            }
            if (_tmpDestinationAdress.getDestinationState() == null) {
              stmt.bindNull(25);
            } else {
              stmt.bindString(25, _tmpDestinationAdress.getDestinationState());
            }
            if (_tmpDestinationAdress.getDestinationPostalCode() == null) {
              stmt.bindNull(26);
            } else {
              stmt.bindString(26, _tmpDestinationAdress.getDestinationPostalCode());
            }
            if (_tmpDestinationAdress.getDestinationCountry() == null) {
              stmt.bindNull(27);
            } else {
              stmt.bindString(27, _tmpDestinationAdress.getDestinationCountry());
            }
            final Cordinates _tmpCordinates = _tmpDestinationAdress.getCordinates();
            if(_tmpCordinates != null) {
              if (_tmpCordinates.getDestinationLatitude() == null) {
                stmt.bindNull(28);
              } else {
                stmt.bindString(28, _tmpCordinates.getDestinationLatitude());
              }
              if (_tmpCordinates.getDestinationLongitude() == null) {
                stmt.bindNull(29);
              } else {
                stmt.bindString(29, _tmpCordinates.getDestinationLongitude());
              }
            } else {
              stmt.bindNull(28);
              stmt.bindNull(29);
            }
          } else {
            stmt.bindNull(22);
            stmt.bindNull(23);
            stmt.bindNull(24);
            stmt.bindNull(25);
            stmt.bindNull(26);
            stmt.bindNull(27);
            stmt.bindNull(28);
            stmt.bindNull(29);
          }
        } else {
          stmt.bindNull(21);
          stmt.bindNull(22);
          stmt.bindNull(23);
          stmt.bindNull(24);
          stmt.bindNull(25);
          stmt.bindNull(26);
          stmt.bindNull(27);
          stmt.bindNull(28);
          stmt.bindNull(29);
        }
        final Vendor _tmpVendor = value.getVendor();
        if(_tmpVendor != null) {
          if (_tmpVendor.getVedorId() == null) {
            stmt.bindNull(30);
          } else {
            stmt.bindString(30, _tmpVendor.getVedorId());
          }
          if (_tmpVendor.getVendorFullName() == null) {
            stmt.bindNull(31);
          } else {
            stmt.bindString(31, _tmpVendor.getVendorFullName());
          }
          if (_tmpVendor.getVendorVehicleNumber() == null) {
            stmt.bindNull(32);
          } else {
            stmt.bindString(32, _tmpVendor.getVendorVehicleNumber());
          }
          if (_tmpVendor.getVendorVehicleModel() == null) {
            stmt.bindNull(33);
          } else {
            stmt.bindString(33, _tmpVendor.getVendorVehicleModel());
          }
        } else {
          stmt.bindNull(30);
          stmt.bindNull(31);
          stmt.bindNull(32);
          stmt.bindNull(33);
        }
      }
    };
    this.__deletionAdapterOfBookingModel = new EntityDeletionOrUpdateAdapter<BookingModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `BookingModel` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookingModel value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfBookingModel = new EntityDeletionOrUpdateAdapter<BookingModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `BookingModel` SET `id` = ?,`context` = ?,`type` = ?,`bookingId` = ?,`status` = ?,`bookingTime` = ?,`pickupTime` = ?,`bid` = ?,`customerFullName` = ?,`mobile` = ?,`email` = ?,`sourecAdressName` = ?,`sourceLatitude` = ?,`sourceLongitude` = ?,`sourceAddress` = ?,`sourceLocation` = ?,`sourceCity` = ?,`sourceState` = ?,`sourcePostalCode` = ?,`sourceCountry` = ?,`destinationAdressName` = ?,`destinationAddress` = ?,`destinationLocation` = ?,`destinantionCity` = ?,`destinationState` = ?,`destinationPostalCode` = ?,`destinationCountry` = ?,`destinationLatitude` = ?,`destinationLongitude` = ?,`vedorId` = ?,`vendorFullName` = ?,`vendorVehicleNumber` = ?,`vendorVehicleModel` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookingModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getContext() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContext());
        }
        if (value.getType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getType());
        }
        if (value.getBookingId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBookingId());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getStatus());
        }
        if (value.getBookingTime() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBookingTime());
        }
        if (value.getPickupTime() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPickupTime());
        }
        final Customer _tmpCustomer = value.getCustomer();
        if(_tmpCustomer != null) {
          if (_tmpCustomer.getBid() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpCustomer.getBid());
          }
          if (_tmpCustomer.getCustomerFullName() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpCustomer.getCustomerFullName());
          }
          if (_tmpCustomer.getMobile() == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindString(10, _tmpCustomer.getMobile());
          }
          if (_tmpCustomer.getEmail() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindString(11, _tmpCustomer.getEmail());
          }
        } else {
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
        }
        final ASource _tmpASource = value.getASource();
        if(_tmpASource != null) {
          if (_tmpASource.getSourecAdressName() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindString(12, _tmpASource.getSourecAdressName());
          }
          if (_tmpASource.getSourceLatitude() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindString(13, _tmpASource.getSourceLatitude());
          }
          if (_tmpASource.getSourceLongitude() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindString(14, _tmpASource.getSourceLongitude());
          }
          final Address _tmpSourceAddress = _tmpASource.getSourceAddress();
          if(_tmpSourceAddress != null) {
            if (_tmpSourceAddress.getSourceAddress() == null) {
              stmt.bindNull(15);
            } else {
              stmt.bindString(15, _tmpSourceAddress.getSourceAddress());
            }
            if (_tmpSourceAddress.getSourceLocation() == null) {
              stmt.bindNull(16);
            } else {
              stmt.bindString(16, _tmpSourceAddress.getSourceLocation());
            }
            if (_tmpSourceAddress.getSourceCity() == null) {
              stmt.bindNull(17);
            } else {
              stmt.bindString(17, _tmpSourceAddress.getSourceCity());
            }
            if (_tmpSourceAddress.getSourceState() == null) {
              stmt.bindNull(18);
            } else {
              stmt.bindString(18, _tmpSourceAddress.getSourceState());
            }
            if (_tmpSourceAddress.getSourcePostalCode() == null) {
              stmt.bindNull(19);
            } else {
              stmt.bindString(19, _tmpSourceAddress.getSourcePostalCode());
            }
            if (_tmpSourceAddress.getSourceCountry() == null) {
              stmt.bindNull(20);
            } else {
              stmt.bindString(20, _tmpSourceAddress.getSourceCountry());
            }
          } else {
            stmt.bindNull(15);
            stmt.bindNull(16);
            stmt.bindNull(17);
            stmt.bindNull(18);
            stmt.bindNull(19);
            stmt.bindNull(20);
          }
        } else {
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
          stmt.bindNull(15);
          stmt.bindNull(16);
          stmt.bindNull(17);
          stmt.bindNull(18);
          stmt.bindNull(19);
          stmt.bindNull(20);
        }
        final Destination _tmpDestination = value.getDestination();
        if(_tmpDestination != null) {
          if (_tmpDestination.destinationAdressName == null) {
            stmt.bindNull(21);
          } else {
            stmt.bindString(21, _tmpDestination.destinationAdressName);
          }
          final DestinationAdress _tmpDestinationAdress = _tmpDestination.getDestinationAdress();
          if(_tmpDestinationAdress != null) {
            if (_tmpDestinationAdress.getDestinationAddress() == null) {
              stmt.bindNull(22);
            } else {
              stmt.bindString(22, _tmpDestinationAdress.getDestinationAddress());
            }
            if (_tmpDestinationAdress.getDestinationLocation() == null) {
              stmt.bindNull(23);
            } else {
              stmt.bindString(23, _tmpDestinationAdress.getDestinationLocation());
            }
            if (_tmpDestinationAdress.getDestinantionCity() == null) {
              stmt.bindNull(24);
            } else {
              stmt.bindString(24, _tmpDestinationAdress.getDestinantionCity());
            }
            if (_tmpDestinationAdress.getDestinationState() == null) {
              stmt.bindNull(25);
            } else {
              stmt.bindString(25, _tmpDestinationAdress.getDestinationState());
            }
            if (_tmpDestinationAdress.getDestinationPostalCode() == null) {
              stmt.bindNull(26);
            } else {
              stmt.bindString(26, _tmpDestinationAdress.getDestinationPostalCode());
            }
            if (_tmpDestinationAdress.getDestinationCountry() == null) {
              stmt.bindNull(27);
            } else {
              stmt.bindString(27, _tmpDestinationAdress.getDestinationCountry());
            }
            final Cordinates _tmpCordinates = _tmpDestinationAdress.getCordinates();
            if(_tmpCordinates != null) {
              if (_tmpCordinates.getDestinationLatitude() == null) {
                stmt.bindNull(28);
              } else {
                stmt.bindString(28, _tmpCordinates.getDestinationLatitude());
              }
              if (_tmpCordinates.getDestinationLongitude() == null) {
                stmt.bindNull(29);
              } else {
                stmt.bindString(29, _tmpCordinates.getDestinationLongitude());
              }
            } else {
              stmt.bindNull(28);
              stmt.bindNull(29);
            }
          } else {
            stmt.bindNull(22);
            stmt.bindNull(23);
            stmt.bindNull(24);
            stmt.bindNull(25);
            stmt.bindNull(26);
            stmt.bindNull(27);
            stmt.bindNull(28);
            stmt.bindNull(29);
          }
        } else {
          stmt.bindNull(21);
          stmt.bindNull(22);
          stmt.bindNull(23);
          stmt.bindNull(24);
          stmt.bindNull(25);
          stmt.bindNull(26);
          stmt.bindNull(27);
          stmt.bindNull(28);
          stmt.bindNull(29);
        }
        final Vendor _tmpVendor = value.getVendor();
        if(_tmpVendor != null) {
          if (_tmpVendor.getVedorId() == null) {
            stmt.bindNull(30);
          } else {
            stmt.bindString(30, _tmpVendor.getVedorId());
          }
          if (_tmpVendor.getVendorFullName() == null) {
            stmt.bindNull(31);
          } else {
            stmt.bindString(31, _tmpVendor.getVendorFullName());
          }
          if (_tmpVendor.getVendorVehicleNumber() == null) {
            stmt.bindNull(32);
          } else {
            stmt.bindString(32, _tmpVendor.getVendorVehicleNumber());
          }
          if (_tmpVendor.getVendorVehicleModel() == null) {
            stmt.bindNull(33);
          } else {
            stmt.bindString(33, _tmpVendor.getVendorVehicleModel());
          }
        } else {
          stmt.bindNull(30);
          stmt.bindNull(31);
          stmt.bindNull(32);
          stmt.bindNull(33);
        }
        stmt.bindLong(34, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllCourses = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM BookingModel";
        return _query;
      }
    };
  }

  @Override
  public void insert(final BookingModel bookingModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfBookingModel.insert(bookingModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final BookingModel bookingModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfBookingModel.handle(bookingModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final BookingModel bookingModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfBookingModel.handle(bookingModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllCourses() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllCourses.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllCourses.release(_stmt);
    }
  }

  @Override
  public LiveData<List<BookingModel>> getAllCourses() {
    final String _sql = "SELECT * FROM BookingModel ORDER BY bookingId ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"BookingModel"}, false, new Callable<List<BookingModel>>() {
      @Override
      public List<BookingModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfContext = CursorUtil.getColumnIndexOrThrow(_cursor, "context");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfBookingId = CursorUtil.getColumnIndexOrThrow(_cursor, "bookingId");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfBookingTime = CursorUtil.getColumnIndexOrThrow(_cursor, "bookingTime");
          final int _cursorIndexOfPickupTime = CursorUtil.getColumnIndexOrThrow(_cursor, "pickupTime");
          final int _cursorIndexOfBid = CursorUtil.getColumnIndexOrThrow(_cursor, "bid");
          final int _cursorIndexOfCustomerFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "customerFullName");
          final int _cursorIndexOfMobile = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfSourecAdressName = CursorUtil.getColumnIndexOrThrow(_cursor, "sourecAdressName");
          final int _cursorIndexOfSourceLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceLatitude");
          final int _cursorIndexOfSourceLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceLongitude");
          final int _cursorIndexOfSourceAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceAddress");
          final int _cursorIndexOfSourceLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceLocation");
          final int _cursorIndexOfSourceCity = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceCity");
          final int _cursorIndexOfSourceState = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceState");
          final int _cursorIndexOfSourcePostalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "sourcePostalCode");
          final int _cursorIndexOfSourceCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceCountry");
          final int _cursorIndexOfDestinationAdressName = CursorUtil.getColumnIndexOrThrow(_cursor, "destinationAdressName");
          final int _cursorIndexOfDestinationAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "destinationAddress");
          final int _cursorIndexOfDestinationLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "destinationLocation");
          final int _cursorIndexOfDestinantionCity = CursorUtil.getColumnIndexOrThrow(_cursor, "destinantionCity");
          final int _cursorIndexOfDestinationState = CursorUtil.getColumnIndexOrThrow(_cursor, "destinationState");
          final int _cursorIndexOfDestinationPostalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "destinationPostalCode");
          final int _cursorIndexOfDestinationCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "destinationCountry");
          final int _cursorIndexOfDestinationLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "destinationLatitude");
          final int _cursorIndexOfDestinationLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "destinationLongitude");
          final int _cursorIndexOfVedorId = CursorUtil.getColumnIndexOrThrow(_cursor, "vedorId");
          final int _cursorIndexOfVendorFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "vendorFullName");
          final int _cursorIndexOfVendorVehicleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "vendorVehicleNumber");
          final int _cursorIndexOfVendorVehicleModel = CursorUtil.getColumnIndexOrThrow(_cursor, "vendorVehicleModel");
          final List<BookingModel> _result = new ArrayList<BookingModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BookingModel _item;
            final Customer _tmpCustomer;
            if (! (_cursor.isNull(_cursorIndexOfBid) && _cursor.isNull(_cursorIndexOfCustomerFullName) && _cursor.isNull(_cursorIndexOfMobile) && _cursor.isNull(_cursorIndexOfEmail))) {
              _tmpCustomer = new Customer();
              final String _tmpBid;
              _tmpBid = _cursor.getString(_cursorIndexOfBid);
              _tmpCustomer.setBid(_tmpBid);
              final String _tmpCustomerFullName;
              _tmpCustomerFullName = _cursor.getString(_cursorIndexOfCustomerFullName);
              _tmpCustomer.setCustomerFullName(_tmpCustomerFullName);
              final String _tmpMobile;
              _tmpMobile = _cursor.getString(_cursorIndexOfMobile);
              _tmpCustomer.setMobile(_tmpMobile);
              final String _tmpEmail;
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
              _tmpCustomer.setEmail(_tmpEmail);
            }  else  {
              _tmpCustomer = null;
            }
            final ASource _tmpASource;
            if (! (_cursor.isNull(_cursorIndexOfSourecAdressName) && _cursor.isNull(_cursorIndexOfSourceLatitude) && _cursor.isNull(_cursorIndexOfSourceLongitude) && _cursor.isNull(_cursorIndexOfSourceAddress) && _cursor.isNull(_cursorIndexOfSourceLocation) && _cursor.isNull(_cursorIndexOfSourceCity) && _cursor.isNull(_cursorIndexOfSourceState) && _cursor.isNull(_cursorIndexOfSourcePostalCode) && _cursor.isNull(_cursorIndexOfSourceCountry))) {
              final Address _tmpSourceAddress;
              if (! (_cursor.isNull(_cursorIndexOfSourceAddress) && _cursor.isNull(_cursorIndexOfSourceLocation) && _cursor.isNull(_cursorIndexOfSourceCity) && _cursor.isNull(_cursorIndexOfSourceState) && _cursor.isNull(_cursorIndexOfSourcePostalCode) && _cursor.isNull(_cursorIndexOfSourceCountry))) {
                _tmpSourceAddress = new Address();
                final String _tmpSourceAddress_1;
                _tmpSourceAddress_1 = _cursor.getString(_cursorIndexOfSourceAddress);
                _tmpSourceAddress.setSourceAddress(_tmpSourceAddress_1);
                final String _tmpSourceLocation;
                _tmpSourceLocation = _cursor.getString(_cursorIndexOfSourceLocation);
                _tmpSourceAddress.setSourceLocation(_tmpSourceLocation);
                final String _tmpSourceCity;
                _tmpSourceCity = _cursor.getString(_cursorIndexOfSourceCity);
                _tmpSourceAddress.setSourceCity(_tmpSourceCity);
                final String _tmpSourceState;
                _tmpSourceState = _cursor.getString(_cursorIndexOfSourceState);
                _tmpSourceAddress.setSourceState(_tmpSourceState);
                final String _tmpSourcePostalCode;
                _tmpSourcePostalCode = _cursor.getString(_cursorIndexOfSourcePostalCode);
                _tmpSourceAddress.setSourcePostalCode(_tmpSourcePostalCode);
                final String _tmpSourceCountry;
                _tmpSourceCountry = _cursor.getString(_cursorIndexOfSourceCountry);
                _tmpSourceAddress.setSourceCountry(_tmpSourceCountry);
              }  else  {
                _tmpSourceAddress = null;
              }
              _tmpASource = new ASource();
              final String _tmpSourecAdressName;
              _tmpSourecAdressName = _cursor.getString(_cursorIndexOfSourecAdressName);
              _tmpASource.setSourecAdressName(_tmpSourecAdressName);
              final String _tmpSourceLatitude;
              _tmpSourceLatitude = _cursor.getString(_cursorIndexOfSourceLatitude);
              _tmpASource.setSourceLatitude(_tmpSourceLatitude);
              final String _tmpSourceLongitude;
              _tmpSourceLongitude = _cursor.getString(_cursorIndexOfSourceLongitude);
              _tmpASource.setSourceLongitude(_tmpSourceLongitude);
              _tmpASource.setSourceAddress(_tmpSourceAddress);
            }  else  {
              _tmpASource = null;
            }
            final Destination _tmpDestination;
            if (! (_cursor.isNull(_cursorIndexOfDestinationAdressName) && _cursor.isNull(_cursorIndexOfDestinationAddress) && _cursor.isNull(_cursorIndexOfDestinationLocation) && _cursor.isNull(_cursorIndexOfDestinantionCity) && _cursor.isNull(_cursorIndexOfDestinationState) && _cursor.isNull(_cursorIndexOfDestinationPostalCode) && _cursor.isNull(_cursorIndexOfDestinationCountry) && _cursor.isNull(_cursorIndexOfDestinationLatitude) && _cursor.isNull(_cursorIndexOfDestinationLongitude))) {
              final DestinationAdress _tmpDestinationAdress;
              if (! (_cursor.isNull(_cursorIndexOfDestinationAddress) && _cursor.isNull(_cursorIndexOfDestinationLocation) && _cursor.isNull(_cursorIndexOfDestinantionCity) && _cursor.isNull(_cursorIndexOfDestinationState) && _cursor.isNull(_cursorIndexOfDestinationPostalCode) && _cursor.isNull(_cursorIndexOfDestinationCountry) && _cursor.isNull(_cursorIndexOfDestinationLatitude) && _cursor.isNull(_cursorIndexOfDestinationLongitude))) {
                final Cordinates _tmpCordinates;
                if (! (_cursor.isNull(_cursorIndexOfDestinationLatitude) && _cursor.isNull(_cursorIndexOfDestinationLongitude))) {
                  _tmpCordinates = new Cordinates();
                  final String _tmpDestinationLatitude;
                  _tmpDestinationLatitude = _cursor.getString(_cursorIndexOfDestinationLatitude);
                  _tmpCordinates.setDestinationLatitude(_tmpDestinationLatitude);
                  final String _tmpDestinationLongitude;
                  _tmpDestinationLongitude = _cursor.getString(_cursorIndexOfDestinationLongitude);
                  _tmpCordinates.setDestinationLongitude(_tmpDestinationLongitude);
                }  else  {
                  _tmpCordinates = null;
                }
                _tmpDestinationAdress = new DestinationAdress();
                final String _tmpDestinationAddress;
                _tmpDestinationAddress = _cursor.getString(_cursorIndexOfDestinationAddress);
                _tmpDestinationAdress.setDestinationAddress(_tmpDestinationAddress);
                final String _tmpDestinationLocation;
                _tmpDestinationLocation = _cursor.getString(_cursorIndexOfDestinationLocation);
                _tmpDestinationAdress.setDestinationLocation(_tmpDestinationLocation);
                final String _tmpDestinantionCity;
                _tmpDestinantionCity = _cursor.getString(_cursorIndexOfDestinantionCity);
                _tmpDestinationAdress.setDestinantionCity(_tmpDestinantionCity);
                final String _tmpDestinationState;
                _tmpDestinationState = _cursor.getString(_cursorIndexOfDestinationState);
                _tmpDestinationAdress.setDestinationState(_tmpDestinationState);
                final String _tmpDestinationPostalCode;
                _tmpDestinationPostalCode = _cursor.getString(_cursorIndexOfDestinationPostalCode);
                _tmpDestinationAdress.setDestinationPostalCode(_tmpDestinationPostalCode);
                final String _tmpDestinationCountry;
                _tmpDestinationCountry = _cursor.getString(_cursorIndexOfDestinationCountry);
                _tmpDestinationAdress.setDestinationCountry(_tmpDestinationCountry);
                _tmpDestinationAdress.setCordinates(_tmpCordinates);
              }  else  {
                _tmpDestinationAdress = null;
              }
              _tmpDestination = new Destination();
              _tmpDestination.destinationAdressName = _cursor.getString(_cursorIndexOfDestinationAdressName);
              _tmpDestination.setDestinationAdress(_tmpDestinationAdress);
            }  else  {
              _tmpDestination = null;
            }
            final Vendor _tmpVendor;
            if (! (_cursor.isNull(_cursorIndexOfVedorId) && _cursor.isNull(_cursorIndexOfVendorFullName) && _cursor.isNull(_cursorIndexOfVendorVehicleNumber) && _cursor.isNull(_cursorIndexOfVendorVehicleModel))) {
              _tmpVendor = new Vendor();
              final String _tmpVedorId;
              _tmpVedorId = _cursor.getString(_cursorIndexOfVedorId);
              _tmpVendor.setVedorId(_tmpVedorId);
              final String _tmpVendorFullName;
              _tmpVendorFullName = _cursor.getString(_cursorIndexOfVendorFullName);
              _tmpVendor.setVendorFullName(_tmpVendorFullName);
              final String _tmpVendorVehicleNumber;
              _tmpVendorVehicleNumber = _cursor.getString(_cursorIndexOfVendorVehicleNumber);
              _tmpVendor.setVendorVehicleNumber(_tmpVendorVehicleNumber);
              final String _tmpVendorVehicleModel;
              _tmpVendorVehicleModel = _cursor.getString(_cursorIndexOfVendorVehicleModel);
              _tmpVendor.setVendorVehicleModel(_tmpVendorVehicleModel);
            }  else  {
              _tmpVendor = null;
            }
            _item = new BookingModel();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpContext;
            _tmpContext = _cursor.getString(_cursorIndexOfContext);
            _item.setContext(_tmpContext);
            final String _tmpType;
            _tmpType = _cursor.getString(_cursorIndexOfType);
            _item.setType(_tmpType);
            final String _tmpBookingId;
            _tmpBookingId = _cursor.getString(_cursorIndexOfBookingId);
            _item.setBookingId(_tmpBookingId);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            _item.setStatus(_tmpStatus);
            final String _tmpBookingTime;
            _tmpBookingTime = _cursor.getString(_cursorIndexOfBookingTime);
            _item.setBookingTime(_tmpBookingTime);
            final String _tmpPickupTime;
            _tmpPickupTime = _cursor.getString(_cursorIndexOfPickupTime);
            _item.setPickupTime(_tmpPickupTime);
            _item.setCustomer(_tmpCustomer);
            _item.setASource(_tmpASource);
            _item.setDestination(_tmpDestination);
            _item.setVendor(_tmpVendor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
