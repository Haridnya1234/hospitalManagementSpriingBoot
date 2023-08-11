import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatePharmacistComponent } from './update-pharmacist.component';

describe('UpdatePharmacistComponent', () => {
  let component: UpdatePharmacistComponent;
  let fixture: ComponentFixture<UpdatePharmacistComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdatePharmacistComponent]
    });
    fixture = TestBed.createComponent(UpdatePharmacistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
