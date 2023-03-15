package com.cloud.salesservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.salesservice.model.InvoiceDtl;
import com.cloud.salesservice.model.InvoiceDtlId;


public interface InvoiceDtlRepository extends JpaRepository<InvoiceDtl,InvoiceDtlId> {

}
