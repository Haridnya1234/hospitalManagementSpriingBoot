import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PharmacistListComponent } from './pharmacist-list.component';

describe('PharmacistListComponent', () => {
  let component: PharmacistListComponent;
  let fixture: ComponentFixture<PharmacistListComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PharmacistListComponent]
    });
    fixture = TestBed.createComponent(PharmacistListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
