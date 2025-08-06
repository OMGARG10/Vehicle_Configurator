package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "invoice_detail")
public class InvoiceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invDtlId;

    public int getInvDtlId() {
		return invDtlId;
	}

	public void setInvDtlId(int invDtlId) {
		this.invDtlId = invDtlId;
	}

	public InvoiceHeader getInvoice() {
		return invoice;
	}

	public void setInvoice(InvoiceHeader invoice) {
		this.invoice = invoice;
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	@ManyToOne
    private InvoiceHeader invoice;

    @ManyToOne
    private Component component;
}
