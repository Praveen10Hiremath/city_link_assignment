package com.example.view.databinding;
import com.example.view.R;
import com.example.view.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBookingDetailsBindingImpl extends FragmentBookingDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.home_scroll_view, 13);
        sViewsWithIds.put(R.id.sourceAddressPin, 14);
        sViewsWithIds.put(R.id.destinationAddressPin, 15);
        sViewsWithIds.put(R.id.noData, 16);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentBookingDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentBookingDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[12]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ScrollView) bindings[13]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.TextView) bindings[9]
            );
        this.bookingId.setTag(null);
        this.bookingStatus.setTag(null);
        this.bookingTime.setTag(null);
        this.customeName.setTag(null);
        this.destinationAddress.setTag(null);
        this.destinationLocation.setTag(null);
        this.email.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mobNo.setTag(null);
        this.pickUpTime.setTag(null);
        this.sourceAddress.setTag(null);
        this.sourceAddressName.setTag(null);
        this.sourceLocation.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.bookingModel == variableId) {
            setBookingModel((com.citylink.model.BookingModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBookingModel(@Nullable com.citylink.model.BookingModel BookingModel) {
        this.mBookingModel = BookingModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.bookingModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String javaLangStringStatusBookingModelStatus = null;
        java.lang.String bookingModelASourceSourecAdressName = null;
        java.lang.String bookingModelDestinationDestinationAdressDestinationLocation = null;
        java.lang.String bookingModelCustomerMobile = null;
        java.lang.String javaLangStringMobileNoBookingModelCustomerMobile = null;
        java.lang.String javaLangStringAdressBookingModelASourceSourecAdressNameJavaLangString = null;
        java.lang.String bookingModelCustomerCustomerFullName = null;
        com.citylink.model.DestinationAdress bookingModelDestinationDestinationAdress = null;
        java.lang.String javaLangStringDestinationLocationBookingModelDestinationDestinationAdressDestinationLocation = null;
        java.lang.String javaLangStringAdressBookingModelDestinationDestinationAdressName = null;
        java.lang.String bookingModelBookingId = null;
        java.lang.String javaLangStringBookingIDBookingModelBookingId = null;
        com.citylink.model.ASource bookingModelASource = null;
        com.citylink.model.BookingModel bookingModel = mBookingModel;
        java.lang.String bookingModelBookingTime = null;
        java.lang.String bookingModelPickupTime = null;
        java.lang.String bookingModelASourceSourceAddressSourceLocation = null;
        java.lang.String javaLangStringAdressBookingModelASourceSourecAdressNameJavaLangStringBookingModelASourceSourceAddressSourceAddress = null;
        java.lang.String javaLangStringAdressBookingModelDestinationDestinationAdressNameJavaLangStringBookingModelDestinationDestinationAdressDestinationAddress = null;
        com.citylink.model.Customer bookingModelCustomer = null;
        java.lang.String javaLangStringEmailIDBookingModelCustomerEmail = null;
        java.lang.String javaLangStringAdressBookingModelASourceSourecAdressName = null;
        java.lang.String bookingModelCustomerEmail = null;
        java.lang.String javaLangStringAdressBookingModelDestinationDestinationAdressNameJavaLangString = null;
        java.lang.String bookingModelDestinationDestinationAdressName = null;
        com.citylink.model.Address bookingModelASourceSourceAddress = null;
        java.lang.String javaLangStringSourceLocationBookingModelASourceSourceAddressSourceLocation = null;
        java.lang.String bookingModelASourceSourceAddressSourceAddress = null;
        java.lang.String javaLangStringPickupTimeBookingModelPickupTime = null;
        com.citylink.model.Destination bookingModelDestination = null;
        java.lang.String javaLangStringCustomerNameBookingModelCustomerCustomerFullName = null;
        java.lang.String javaLangStringBookingTimeBookingModelBookingTime = null;
        java.lang.String bookingModelDestinationDestinationAdressDestinationAddress = null;
        java.lang.String bookingModelStatus = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (bookingModel != null) {
                    // read bookingModel.bookingId
                    bookingModelBookingId = bookingModel.getBookingId();
                    // read bookingModel.ASource
                    bookingModelASource = bookingModel.getASource();
                    // read bookingModel.bookingTime
                    bookingModelBookingTime = bookingModel.getBookingTime();
                    // read bookingModel.pickupTime
                    bookingModelPickupTime = bookingModel.getPickupTime();
                    // read bookingModel.customer
                    bookingModelCustomer = bookingModel.getCustomer();
                    // read bookingModel.destination
                    bookingModelDestination = bookingModel.getDestination();
                    // read bookingModel.status
                    bookingModelStatus = bookingModel.getStatus();
                }


                // read ("Booking ID : ") + (bookingModel.bookingId)
                javaLangStringBookingIDBookingModelBookingId = ("Booking ID : ") + (bookingModelBookingId);
                // read ("Booking Time : ") + (bookingModel.bookingTime)
                javaLangStringBookingTimeBookingModelBookingTime = ("Booking Time : ") + (bookingModelBookingTime);
                // read ("Pickup Time : ") + (bookingModel.pickupTime)
                javaLangStringPickupTimeBookingModelPickupTime = ("Pickup Time : ") + (bookingModelPickupTime);
                // read ("Status : ") + (bookingModel.status)
                javaLangStringStatusBookingModelStatus = ("Status : ") + (bookingModelStatus);
                if (bookingModelASource != null) {
                    // read bookingModel.ASource.sourecAdressName
                    bookingModelASourceSourecAdressName = bookingModelASource.getSourecAdressName();
                    // read bookingModel.ASource.sourceAddress
                    bookingModelASourceSourceAddress = bookingModelASource.getSourceAddress();
                }
                if (bookingModelCustomer != null) {
                    // read bookingModel.customer.mobile
                    bookingModelCustomerMobile = bookingModelCustomer.getMobile();
                    // read bookingModel.customer.customerFullName
                    bookingModelCustomerCustomerFullName = bookingModelCustomer.getCustomerFullName();
                    // read bookingModel.customer.email
                    bookingModelCustomerEmail = bookingModelCustomer.getEmail();
                }
                if (bookingModelDestination != null) {
                    // read bookingModel.destination.destinationAdress
                    bookingModelDestinationDestinationAdress = bookingModelDestination.getDestinationAdress();
                    // read bookingModel.destination.destinationAdressName
                    bookingModelDestinationDestinationAdressName = bookingModelDestination.getDestinationAdressName();
                }


                // read ("Adress : ") + (bookingModel.ASource.sourecAdressName)
                javaLangStringAdressBookingModelASourceSourecAdressName = ("Adress : ") + (bookingModelASourceSourecAdressName);
                // read ("Mobile No : ") + (bookingModel.customer.mobile)
                javaLangStringMobileNoBookingModelCustomerMobile = ("Mobile No : ") + (bookingModelCustomerMobile);
                // read ("Customer Name : ") + (bookingModel.customer.customerFullName)
                javaLangStringCustomerNameBookingModelCustomerCustomerFullName = ("Customer Name : ") + (bookingModelCustomerCustomerFullName);
                // read ("Email ID : ") + (bookingModel.customer.email)
                javaLangStringEmailIDBookingModelCustomerEmail = ("Email ID : ") + (bookingModelCustomerEmail);
                // read ("Adress : ") + (bookingModel.destination.destinationAdressName)
                javaLangStringAdressBookingModelDestinationDestinationAdressName = ("Adress : ") + (bookingModelDestinationDestinationAdressName);
                if (bookingModelASourceSourceAddress != null) {
                    // read bookingModel.ASource.sourceAddress.sourceLocation
                    bookingModelASourceSourceAddressSourceLocation = bookingModelASourceSourceAddress.getSourceLocation();
                    // read bookingModel.ASource.sourceAddress.sourceAddress
                    bookingModelASourceSourceAddressSourceAddress = bookingModelASourceSourceAddress.getSourceAddress();
                }
                if (bookingModelDestinationDestinationAdress != null) {
                    // read bookingModel.destination.destinationAdress.destinationLocation
                    bookingModelDestinationDestinationAdressDestinationLocation = bookingModelDestinationDestinationAdress.getDestinationLocation();
                    // read bookingModel.destination.destinationAdress.destinationAddress
                    bookingModelDestinationDestinationAdressDestinationAddress = bookingModelDestinationDestinationAdress.getDestinationAddress();
                }


                // read (("Adress : ") + (bookingModel.ASource.sourecAdressName)) + (", ")
                javaLangStringAdressBookingModelASourceSourecAdressNameJavaLangString = (javaLangStringAdressBookingModelASourceSourecAdressName) + (", ");
                // read (("Adress : ") + (bookingModel.destination.destinationAdressName)) + (", ")
                javaLangStringAdressBookingModelDestinationDestinationAdressNameJavaLangString = (javaLangStringAdressBookingModelDestinationDestinationAdressName) + (", ");
                // read ("Source Location : ") + (bookingModel.ASource.sourceAddress.sourceLocation)
                javaLangStringSourceLocationBookingModelASourceSourceAddressSourceLocation = ("Source Location : ") + (bookingModelASourceSourceAddressSourceLocation);
                // read ("Destination Location : ") + (bookingModel.destination.destinationAdress.destinationLocation)
                javaLangStringDestinationLocationBookingModelDestinationDestinationAdressDestinationLocation = ("Destination Location : ") + (bookingModelDestinationDestinationAdressDestinationLocation);


                // read ((("Adress : ") + (bookingModel.ASource.sourecAdressName)) + (", ")) + (bookingModel.ASource.sourceAddress.sourceAddress)
                javaLangStringAdressBookingModelASourceSourecAdressNameJavaLangStringBookingModelASourceSourceAddressSourceAddress = (javaLangStringAdressBookingModelASourceSourecAdressNameJavaLangString) + (bookingModelASourceSourceAddressSourceAddress);
                // read ((("Adress : ") + (bookingModel.destination.destinationAdressName)) + (", ")) + (bookingModel.destination.destinationAdress.destinationAddress)
                javaLangStringAdressBookingModelDestinationDestinationAdressNameJavaLangStringBookingModelDestinationDestinationAdressDestinationAddress = (javaLangStringAdressBookingModelDestinationDestinationAdressNameJavaLangString) + (bookingModelDestinationDestinationAdressDestinationAddress);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bookingId, javaLangStringBookingIDBookingModelBookingId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bookingStatus, javaLangStringStatusBookingModelStatus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bookingTime, javaLangStringBookingTimeBookingModelBookingTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.customeName, javaLangStringCustomerNameBookingModelCustomerCustomerFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.destinationAddress, javaLangStringAdressBookingModelDestinationDestinationAdressNameJavaLangStringBookingModelDestinationDestinationAdressDestinationAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.destinationLocation, javaLangStringDestinationLocationBookingModelDestinationDestinationAdressDestinationLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.email, javaLangStringEmailIDBookingModelCustomerEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mobNo, javaLangStringMobileNoBookingModelCustomerMobile);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pickUpTime, javaLangStringPickupTimeBookingModelPickupTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sourceAddressName, javaLangStringAdressBookingModelASourceSourecAdressNameJavaLangStringBookingModelASourceSourceAddressSourceAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sourceLocation, javaLangStringSourceLocationBookingModelASourceSourceAddressSourceLocation);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sourceAddress, "Source : MobileApp");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bookingModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}