import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletappointmentComponent } from './deletappointment.component';

describe('DeletappointmentComponent', () => {
  let component: DeletappointmentComponent;
  let fixture: ComponentFixture<DeletappointmentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeletappointmentComponent]
    });
    fixture = TestBed.createComponent(DeletappointmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
