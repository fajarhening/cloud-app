package com.cloud.salesservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.salesservice.model.InvoiceDtlId;
import com.cloud.salesservice.model.InvoiceDtlOnline;

public interface InvoiceDtlOnlineRepository extends JpaRepository<InvoiceDtlOnline,InvoiceDtlId> {

}
